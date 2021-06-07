package com.wmp.htmlparser.service;

import com.wmp.htmlparser.domain.Arranger;
import com.wmp.htmlparser.domain.OutputSet;
import com.wmp.htmlparser.domain.Remover;
import com.wmp.htmlparser.dto.ParseRequestDto;
import com.wmp.htmlparser.dto.ParseResponseDto;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ParseService {

    public ParseResponseDto parse(final ParseRequestDto parseRequestDto) {
        final String htmlText = getRequest(parseRequestDto.getUrl());
        final Remover remover = new Remover(htmlText, parseRequestDto.getRemoveTypeNumber());
        final OutputSet outputSet = new OutputSet(Arranger.rearrange(remover.getRemovedStr()), parseRequestDto.getOutputUnitCount());
        return new ParseResponseDto(outputSet);
    }

    private String getRequest(final String url) {
        try {
            return Jsoup.connect(url).get().data();
        } catch (final IOException e) {
            throw new IllegalStateException("접근할 수 없는 url입니다");
        }
    }

}
