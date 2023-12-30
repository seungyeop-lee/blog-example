package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_side_effect.unexpected_side_effect;

public interface Canvas {
    void redraw();

    PixelData getPixel(int x, int y);

    int getWidth();

    int getHeight();

    void delete(int x, int y, int width, int height);
}
