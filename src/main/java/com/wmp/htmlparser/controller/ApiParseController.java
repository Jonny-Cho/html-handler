package com.wmp.htmlparser.controller;

import com.wmp.htmlparser.dto.ParseRequestDto;
import com.wmp.htmlparser.dto.ParseResponseDto;
import com.wmp.htmlparser.service.ParseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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

    @Operation(summary = "parse api", description = "URL 파싱 후 데이터 가공 하는 api")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
        @ApiResponse(responseCode = "404", description = "NOT FOUND"),
        @ApiResponse(responseCode = "500", description = "SERVER ERROR")
    })
    @PostMapping("parse")
    public ResponseEntity<ParseResponseDto> parseWithoutHtml(@RequestBody @Valid ParseRequestDto parseRequestDto) {
        return new ResponseEntity<>(parseService.parse(parseRequestDto), HttpStatus.OK);
    }

}
