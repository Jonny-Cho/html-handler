package com.wmp.htmlparser.util;

import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UrlConnector {

    public String getHtmlText(final String url) {
        try {
            return Jsoup.connect(url).get().data();
        } catch (final IOException e) {
            throw new IllegalArgumentException("접근할 수 없는 url입니다");
        }
    }

}
