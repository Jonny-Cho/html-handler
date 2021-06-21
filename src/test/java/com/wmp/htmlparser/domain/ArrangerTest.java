//package com.wmp.htmlparser.domain;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class ArrangerTest {
//
//    @DisplayName("String을 입력받으면 정렬된 영어 + 정렬된 숫자를 얻을 수 있다")
//    @Test
//    void normalCase() {
//        assertThat(Arranger.rearrange("e4C3dBA1aDf2cEAb0bF")).isEqualTo("AAaBbbCcDdEeFf01234");
//    }
//
//    @DisplayName("String을 입력받을 때 숫자와 영어 이외의 값이 포함된 경우 지운다")
//    @Test
//    void removeSpecialChars() {
//        assertThat(Arranger.rearrange("e4C3dB1<aDf2c!EA0@bF")).isEqualTo("AaBbCcDdEeFf01234");
//    }
//
//}
