package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_null_object_pattern.empty_collection;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_null_object_pattern.empty_collection.stub.HtmlElement;

import java.util.Set;

public class ReturnNull {
    boolean isElementHighlighted(HtmlElement element) {
        Set<String> classNames = getClassNames(element);
        if (classNames == null) {
            return false;
        }
        return classNames.contains("highlighted");
    }

    Set<String> getClassNames(HtmlElement element) {
        String attribute = element.getAttribute("class");
        if (attribute == null) {
            return null;
        }
        return Set.of(attribute.split(" "));
    }
}
