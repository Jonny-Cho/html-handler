package com.wmp.htmlparser.service;

import com.wmp.htmlparser.domain.OutputSet;
import com.wmp.htmlparser.domain.RemoveType;
import com.wmp.htmlparser.domain.Remover;
import com.wmp.htmlparser.domain.Separator;
import com.wmp.htmlparser.dto.ParseRequestDto;
import com.wmp.htmlparser.dto.ParseResponseDto;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ParseService {

    public ParseResponseDto parse(final ParseRequestDto parseRequestDto) throws IllegalAccessException {
        final String htmlText = getRequest(parseRequestDto.getUrl());
        final RemoveType removeType = RemoveType.find(parseRequestDto.getRemoveTypeNumber());
        final Remover remover = new Remover(htmlText, removeType.getRemoveStrategy());
        final Separator separator = new Separator(remover.getRemovedStr());
        final OutputSet outputSet = new OutputSet(separator.getResult(), parseRequestDto.getOutputUnitCount());
        return new ParseResponseDto(outputSet);
    }

    private String getRequest(final String url) throws IllegalAccessException {
        try {
            return Jsoup.connect(url).get().data();
        } catch (final IOException e) {
            throw new IllegalAccessException("접근할 수 없는 url입니다");
        }
    }

}
