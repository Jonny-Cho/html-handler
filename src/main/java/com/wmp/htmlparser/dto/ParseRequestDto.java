package com.wmp.htmlparser.dto;

import com.wmp.htmlparser.util.remove.RemoveType;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ParseRequestDto {

    @Pattern(regexp = "(http)s?:\\/\\/(www\\.)?[a-zA-Z0-9@:%._\\+~#=]+\\.[a-zA-Z0-9@:%._\\/+-~#=?]+", message = "url 형식이 아닙니다.")
    private String url;

    private RemoveType removeType;

    @Min(value = 1, message = "1이상의 수를 입력해주세요")
    private int outputUnitCount;

}
