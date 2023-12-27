package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_client_recovery_error_delivery.unchecked_exception;

import java.time.Instant;

interface DataLogger {
    void logDataPoint(Instant time, Double value);
}
