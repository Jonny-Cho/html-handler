package com.wmp.htmlparser.dto;

import com.wmp.htmlparser.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponseDto {

    private final String message;
    private final int status;
    private final String code;

    public static ErrorResponseDto of(final ErrorCode errorCode, final String errorMessage) {
        return new ErrorResponseDto(errorMessage, errorCode.getStatus(), errorCode.getCode());
    }
}
