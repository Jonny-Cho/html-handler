package com.wmp.htmlparser.controller;

import com.wmp.htmlparser.dto.ParseRequestDto;
import com.wmp.htmlparser.dto.ParseResponseDto;
import com.wmp.htmlparser.service.ParseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
public class ApiParseController {

    private final ParseService parseService;

    @PostMapping("parse")
    public ResponseEntity<ParseResponseDto> parseWithoutHtml(@RequestBody @Valid ParseRequestDto parseRequestDto) {
        return new ResponseEntity<>(parseService.parse(parseRequestDto), HttpStatus.OK);
    }

}
