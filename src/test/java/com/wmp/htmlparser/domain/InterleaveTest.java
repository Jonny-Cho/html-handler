package com.wmp.htmlparser.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InterleaveTest {

    @DisplayName("문자열 두개가 주어질 때 하나씩 교차하여 출력한다")
    @Test
    void test() {
        final Interleave interleave = new Interleave("aaaaaaa", "1111");
        assertThat(interleave.getResult()).isEqualTo("a1a1a1a1aaa");
    }

}
