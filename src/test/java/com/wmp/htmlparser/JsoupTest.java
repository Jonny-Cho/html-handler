package com.wmp.htmlparser;

import org.jsoup.Jsoup;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class JsoupTest {

    @DisplayName("http(s) 프로토콜을 붙이지 않은 경우 IllegalArgumentException")
    @Test
    void withoutProtocol() {
        assertThatThrownBy(() -> {
            Jsoup.connect("www.naver.com").get().data();
        }).isInstanceOf(IllegalArgumentException.class);
    }

}
