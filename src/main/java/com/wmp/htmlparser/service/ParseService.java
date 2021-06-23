package com.wmp.htmlparser.service;

import com.wmp.htmlparser.domain.*;
import com.wmp.htmlparser.dto.ParseRequestDto;
import com.wmp.htmlparser.dto.ParseResponseDto;
import com.wmp.htmlparser.util.Arranger;
import com.wmp.htmlparser.util.Interleave;
import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Service;

import java.io.IOException;

@RequiredArgsConstructor
@Service
public class ParseService {

    private final Arranger arranger;
    private final Interleave interleave;

    public ParseResponseDto parse(final ParseRequestDto parseRequestDto) {
        final String htmlText = getRequest(parseRequestDto.getUrl());
        final RemoveType removeType = RemoveType.find(parseRequestDto.getRemoveTypeNumber());
        final Remover remover = new Remover(htmlText, removeType.getRemoveStrategy());
        final Arranger arranger = this.arranger.rearrange(remover.getRemovedStr());
        final OutputSet outputSet = new OutputSet(interleave.interleave(arranger.getSortedEnglish(), arranger.getSortedNumber()), parseRequestDto.getOutputUnitCount());
        return new ParseResponseDto(outputSet);
    }

    private String getRequest(final String url) {
        try {
            return Jsoup.connect(url).get().data();
        } catch (final IOException e) {
            throw new IllegalArgumentException("접근할 수 없는 url입니다");
        }
    }

}
