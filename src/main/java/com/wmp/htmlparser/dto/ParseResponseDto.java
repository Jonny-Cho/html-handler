package com.wmp.htmlparser.dto;

import com.wmp.htmlparser.domain.OutputSet;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@EqualsAndHashCode
public class ParseResponseDto {

    private final String quotient;
    private final String remainder;

    public ParseResponseDto(final OutputSet outputSet) {
        this.quotient = outputSet.getQuotient();
        this.remainder = outputSet.getRemainder();
    }

}
