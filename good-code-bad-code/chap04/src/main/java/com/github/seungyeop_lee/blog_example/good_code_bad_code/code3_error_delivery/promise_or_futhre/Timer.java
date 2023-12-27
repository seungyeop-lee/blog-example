package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.promise_or_futhre;

import java.time.Duration;

class Timer {
    public static void wait(Duration duration) {
        try {
            duration.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
