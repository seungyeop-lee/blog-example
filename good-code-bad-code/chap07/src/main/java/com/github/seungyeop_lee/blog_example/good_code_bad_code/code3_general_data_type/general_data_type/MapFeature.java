package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_general_data_type.general_data_type;

import java.util.List;

public class MapFeature {
    private final Double latitude;
    private final Double longitude;

    public MapFeature(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /*
     * 2 개의 요소를 갖는 리스트를 반환한다. 첫 번째 값은 위도를 나타내고
     * 두 번째 값은 경도를 나타낸다(둘 다 각도 값).
     */
    List<Double> getLocation() {
        return List.of(latitude, longitude);
    }
}
