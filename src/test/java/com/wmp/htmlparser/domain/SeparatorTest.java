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

    // String을 입력받을 때 숫자와 영어 이외의 값이 포함된 경우 exception? 아니면 무시하기?
//    @DisplayName("String을 입력받을 때 숫자와 영어 이외의 값이 포함된 경우 exception")
//    @Test
//    void error(){
//        final Separator separator = new Separator("e4C3dB1<aDf2c!EA0@bF");
//        assertThat(separator.getSortedEnglish()).isEqualTo("AaBbCcDdEeFf");
//        assertThat(separator.getSortedNumber()).isEqualTo("01234");
//    }

}
