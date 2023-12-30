package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_null_object_pattern.empty_collection;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_null_object_pattern.empty_collection.stub.HtmlElement;

import java.util.Set;

public class ReturnEmptyCollection {
    boolean isElementHighlighted(HtmlElement element) {
        return getClassNames(element).contains("highlighted");
    }

    Set<String> getClassNames(HtmlElement element) {
        String attribute = element.getAttribute("class");
        if (attribute == null) {
            return Set.of();
        }
        return Set.of(attribute.split(" "));
    }
}
