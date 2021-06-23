package com.wmp.htmlparser.service;

import com.wmp.htmlparser.domain.OutputSet;
import com.wmp.htmlparser.dto.ParseRequestDto;
import com.wmp.htmlparser.dto.ParseResponseDto;
import com.wmp.htmlparser.util.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ParseService {

    private final Arranger arranger;
    private final Interleaver interleaver;
    private final UrlConnector urlConnector;

    public ParseResponseDto parse(final ParseRequestDto parseRequestDto) {
        final String htmlText = urlConnector.getHtmlText(parseRequestDto.getUrl());
        final RemoveType removeType = RemoveType.find(parseRequestDto.getRemoveTypeNumber());
        final Remover remover = new Remover(htmlText, removeType.getRemoveStrategy());
        final Arranger arranger = this.arranger.rearrange(remover.getRemovedStr());
        final OutputSet outputSet = new OutputSet(interleaver.interleave(arranger.getSortedEnglish(), arranger.getSortedNumber()), parseRequestDto.getOutputUnitCount());
        return new ParseResponseDto(outputSet);
    }

}
