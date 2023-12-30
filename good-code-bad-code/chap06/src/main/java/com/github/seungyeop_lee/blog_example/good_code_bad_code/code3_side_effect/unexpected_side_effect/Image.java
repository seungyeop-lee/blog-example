package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_side_effect.unexpected_side_effect;

public class Image {
    private final int width;
    private final int height;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setPixel(int x, int y, Color pixel) {

    }
}
