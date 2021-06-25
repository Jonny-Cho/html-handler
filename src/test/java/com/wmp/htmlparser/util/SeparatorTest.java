package com.wmp.htmlparser.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SeparatorTest {

    private final Separator separator = new Separator();

    @DisplayName("String을 입력받으면 영어부분과 숫자부분을 얻을 수 있다")
    @Test
    void normalCase() {
        Separator sep = separator.separate("e4C3dBA1aDf2cEAb0bF");
        assertThat(sep.getEnglish()).isEqualTo("eCdBAaDfcEAbbF");
        assertThat(sep.getNumber()).isEqualTo("43120");
    }

    @DisplayName("String을 입력받을 때 숫자와 영어 이외의 값이 포함된 경우 지운다")
    @Test
    void removeSpecialChars() {
        Separator sep = separator.separate("e4C3!d@BA#1a$Df%2c^EA[b0]bF");
        assertThat(sep.getEnglish()).isEqualTo("eCdBAaDfcEAbbF");
        assertThat(sep.getNumber()).isEqualTo("43120");
    }

}
