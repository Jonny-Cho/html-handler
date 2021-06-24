package com.wmp.htmlparser.util;

import com.wmp.htmlparser.util.Interleaver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class InterleaveTest {

    @Autowired
    private Interleaver interleave;

    @DisplayName("문자열 두개가 주어질 때 하나씩 교차하여 출력한다")
    @Test
    void test() {
        assertThat(this.interleave.interleave("aaaaaaa", "1111")).isEqualTo("a1a1a1a1aaa");
    }

}
