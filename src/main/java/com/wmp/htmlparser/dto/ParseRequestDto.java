package com.wmp.htmlparser.dto;

import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@EqualsAndHashCode
public class ParseRequestDto {

    private String url;
    private int removeTypeNumber;
    private int outputUnitCount;

}
