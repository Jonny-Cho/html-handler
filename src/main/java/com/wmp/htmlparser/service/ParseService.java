package com.wmp.htmlparser.service;

import com.wmp.htmlparser.util.OutputSet;
import com.wmp.htmlparser.dto.ParseRequestDto;
import com.wmp.htmlparser.dto.ParseResponseDto;
import com.wmp.htmlparser.util.*;
import com.wmp.htmlparser.util.remove.RemoveStrategy;
import com.wmp.htmlparser.util.remove.RemoveType;
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
        final RemoveType removeType = parseRequestDto.getRemoveType();
        final RemoveStrategy removeStrategy = removeType.getRemoveStrategy();
        final String removedStr = removeStrategy.remove(htmlText);
        final Arranger arranger = this.arranger.rearrange(removedStr);
        final OutputSet outputSet = new OutputSet(interleaver.interleave(arranger), parseRequestDto.getOutputUnitCount());
        return new ParseResponseDto(outputSet);
    }

}
