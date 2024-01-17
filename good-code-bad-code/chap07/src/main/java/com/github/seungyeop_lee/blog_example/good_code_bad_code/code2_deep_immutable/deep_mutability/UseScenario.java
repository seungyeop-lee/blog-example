package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_deep_immutable.deep_mutability;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_deep_immutable.stub.Font;

import java.util.ArrayList;
import java.util.List;

public class UseScenario {
    private static class A {
        void logic() {
            List<Font> fontFamily = new ArrayList<>();
            fontFamily.add(Font.ARIAL);
            fontFamily.add(Font.VERDANA);

            TextOptions textOptions = new TextOptions(fontFamily, 12.0);

            fontFamily.clear();
            fontFamily.add(Font.COMIC_SANS);
        }
    }

    private static class B {
        void logic() {
            TextOptions textOptions = new TextOptions(
                    new ArrayList<>() {{
                        add(Font.ARIAL);
                        add(Font.VERDANA);
                    }},
                    12.0);

            List<Font> fontFamily = textOptions.getFontFamily();
            fontFamily.clear();
            fontFamily.add(Font.COMIC_SANS);
        }
    }
}
