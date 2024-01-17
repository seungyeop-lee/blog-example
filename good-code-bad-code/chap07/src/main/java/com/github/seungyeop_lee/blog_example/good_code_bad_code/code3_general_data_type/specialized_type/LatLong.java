package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_general_data_type.specialized_type;

/**
 * 위도와 경도를 각도로 나타낸다.
 */
public class LatLong {
    private final Double latitude;
    private final Double longitude;

    LatLong(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    Double getLatitude() {
        return latitude;
    }

    Double getLongitude() {
        return longitude;
    }
}
