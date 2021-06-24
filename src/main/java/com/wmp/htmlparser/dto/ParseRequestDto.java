package com.wmp.htmlparser.dto;

import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import static com.wmp.htmlparser.util.RemoveType.Constants.TYPE_MAX_NUMBER;
import static com.wmp.htmlparser.util.RemoveType.Constants.TYPE_MIN_NUMBER;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@EqualsAndHashCode
public class ParseRequestDto {

    @Pattern(
            regexp = "(http)s?:\\/\\/(www\\.)?[a-zA-Z0-9@:%._\\+~#=]+\\.[a-zA-Z0-9@:%._\\/+-~#=?]+",
            message = "url 형식이 아닙니다."
    )
    private String url;

    @Range(min = TYPE_MIN_NUMBER, max = TYPE_MAX_NUMBER, message = "유효하지 않은 removeTypeNumber입니다.")
    private int removeTypeNumber;

    @Min(value = 1, message = "1이상의 수를 입력해주세요")
    private int outputUnitCount;

}
