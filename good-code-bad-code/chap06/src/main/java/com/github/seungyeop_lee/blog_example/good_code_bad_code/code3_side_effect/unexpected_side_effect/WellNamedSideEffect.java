package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_side_effect.unexpected_side_effect;

import java.util.List;

public class WellNamedSideEffect {
    private static class UserDisplay {
        private final Canvas canvas;

        private UserDisplay(Canvas canvas) {
            this.canvas = canvas;
        }

        Color redrawAndGetPixel(int x, int y) {
            canvas.redraw();
            PixelData data = canvas.getPixel(x, y);
            return new Color(
                    data.getRed(),
                    data.getGreen(),
                    data.getBlue()
            );
        }

        Image captureScreenshot() {
            Image image = new Image(canvas.getWidth(), canvas.getHeight());
            for (int x = 0; x < image.getWidth(); ++x) {
                for (int y = 0; y < image.getHeight(); ++y) {
                    image.setPixel(x, y, redrawAndGetPixel(x, y)); // 이거 괜찮은가? 란 생각을 할 수 있게 함
                }
            }
            return image;
        }

        List<Box> getPrivacySensitiveAreas() {
            return List.of();
        }

        Image captureRedactedScreenshot() {
            for (Box area : getPrivacySensitiveAreas()) {
                canvas.delete(
                        area.getX(), area.getY(),
                        area.getWidth(), area.getHeight()
                );
            }
            Image screenshot = captureScreenshot();
            canvas.redraw();
            return screenshot;
        }
    }
}
