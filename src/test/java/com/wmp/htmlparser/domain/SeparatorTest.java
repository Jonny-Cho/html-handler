package com.wmp.htmlparser.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SeparatorTest {

    @DisplayName("String을 입력받으면 정렬된 영어와 정렬된 숫자를 얻을 수 있다")
    @Test
    void normalCase() {
        final Separator separator = new Separator("e4C3dBA1aDf2cEAb0bF");
        assertThat(separator.getSortedEnglish()).isEqualTo("AAaBbbCcDdEeFf");
        assertThat(separator.getSortedNumber()).isEqualTo("01234");
    }

    @DisplayName("String을 입력받을 때 숫자와 영어 이외의 값이 포함된 경우 지운다")
    @Test
    void removeSpecialChars(){
        final Separator separator = new Separator("e4C3dB1<aDf2c!EA0@bF");
        assertThat(separator.getSortedEnglish()).isEqualTo("AaBbCcDdEeFf");
        assertThat(separator.getSortedNumber()).isEqualTo("01234");
    }

    @DisplayName("getResult는 정렬된 영어 + 정렬된 숫자를 합쳐서 리턴한다")
    @Test
    void getResult(){
        final Separator separator = new Separator("e4C3dB1<aDf2c!EA0@bF");
        assertThat(separator.getResult()).isEqualTo("AaBbCcDdEeFf01234");
    }

}
