package com.wmp.htmlparser.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Arranger {

    private final Separator separator;
    private final Sorter sorter;

    @Getter
    private String sortedEnglish;

    @Getter
    private String sortedNumber;

    public Arranger rearrange(final String str) {
        final Separator separate = separator.separate(str);
        this.sortedEnglish = sorter.stringSort(separate.getEnglish());
        this.sortedNumber = sorter.numberSort(separate.getNumber());
        return this;
    }

}
