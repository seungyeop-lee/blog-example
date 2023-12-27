package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_client_recovery_error_delivery.checked_exception;

import java.io.IOException;
import java.time.Instant;

interface DataLogger {
    void logDataPoint(Instant time, Double value) throws IOException;
}
