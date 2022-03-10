package com.wmp.htmlparser.util.remove;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class RemoveTypeTest {

    @DisplayName("Type - Strategy 매칭 확인")
    @ParameterizedTest
    @EnumSource(RemoveType.class)
    void removeHtml(final RemoveType removeType) {
        final RemoveStrategy removeStrategy = removeType.getRemoveStrategy();
        assertThat(removeStrategy).isInstanceOf(removeType.getRemoveStrategy().getClass());
    }

}
