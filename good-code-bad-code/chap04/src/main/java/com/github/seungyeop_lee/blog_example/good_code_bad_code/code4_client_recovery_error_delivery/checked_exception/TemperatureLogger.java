package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_client_recovery_error_delivery.checked_exception;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_client_recovery_error_delivery.stub.Thermometer;

import java.io.IOException;
import java.time.Instant;

public class TemperatureLogger {
    private final Thermometer thermometer;
    private final DataLogger dataLogger;

    public TemperatureLogger(Thermometer thermometer, DataLogger dataLogger) {
        this.thermometer = thermometer;
        this.dataLogger = dataLogger;
    }

    void logCurrentTemperature() {
        try {
            dataLogger.logDataPoint(
                    Instant.now(),
                    thermometer.getTemperature()
            );
        } catch (IOException e) {
            logError(e);
        }
    }

    private void logError(IOException e) {
    }
}
