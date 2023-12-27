package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_client_recovery_error_delivery.unchecked_exception;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_client_recovery_error_delivery.stub.DataPoint;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_client_recovery_error_delivery.stub.InMemoryDataStore;

import java.time.Instant;

class InMemoryDataLogger implements DataLogger {

    private final InMemoryDataStore dataStore;

    public InMemoryDataLogger(InMemoryDataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void logDataPoint(Instant time, Double value) {
        dataStore.store(new DataPoint(time.toEpochMilli(), value));
    }
}
