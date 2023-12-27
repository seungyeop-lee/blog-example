package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_client_recovery_error_delivery.unchecked_exception;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_client_recovery_error_delivery.stub.DataPoint;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_client_recovery_error_delivery.stub.DiskDataStore;

import java.io.IOException;
import java.time.Instant;

class DiskDataLogger implements DataLogger {

    private final DiskDataStore dataStore;

    public DiskDataLogger(DiskDataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void logDataPoint(Instant time, Double value) {
        try {
            dataStore.store(new DataPoint(time.toEpochMilli(), value));
        } catch (IOException e) {
        }
    }
}
