package com.wmp.htmlparser.dto;

import lombok.*;

import javax.validation.constraints.Min;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@EqualsAndHashCode
public class ParseRequestDto {

    private String url;
    private int removeTypeNumber;

    @Min(value = 1, message = "1이상의 수를 입력해주세요")
    private int outputUnitCount;

}
