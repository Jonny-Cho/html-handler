package com.wmp.htmlparser.domain;

import com.wmp.htmlparser.domain.removestrategy.RemoveHtml;
import com.wmp.htmlparser.domain.removestrategy.RemoveNothing;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoverTest {

    public static final String SAMPLE_HTML = "<html><a>abc</a></html>";

    @DisplayName("RemoveHtml 전략을 사용하면 태그를 지운 결과를 리턴한다")
    @Test
    void removeHtml(){
        final String removedStr = new Remover(SAMPLE_HTML, new RemoveHtml()).getRemovedStr();
        assertThat(removedStr).isEqualTo("abc");
    }

    @DisplayName("RemoveNothing 전략을 사용하면 아무것도 지우지 않는다")
    @Test
    void removeNothing(){
        final String removedStr = new Remover(SAMPLE_HTML, new RemoveNothing()).getRemovedStr();
        assertThat(removedStr).isEqualTo(SAMPLE_HTML);
    }

}
