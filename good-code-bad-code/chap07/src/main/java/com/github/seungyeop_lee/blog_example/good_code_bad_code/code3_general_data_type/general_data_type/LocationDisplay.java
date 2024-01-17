package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_general_data_type.general_data_type;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_general_data_type.stub.DrawableMap;

import java.util.List;

class LocationDisplay {
    private final DrawableMap map;

    public LocationDisplay(DrawableMap map) {
        this.map = map;
    }

    /**
     * 지도 위에 제공된 모든 좌표의 위치를 표시한다.
     * <p>
     * 리스트의 리스트를 받아들이는데, 내부의 리스트는 정확히
     * 두 개의 값을 가지고 있다. 첫 번째 값은 위치의 위도이고
     * 두 번째 값은 경도를 나타낸다(둘 다 각도 값).
     */
    void markLocationsOnMap(List<List<Double>> locations) {
        for (List<Double> location : locations) {
            map.markLocation(
                    location.get(0),
                    location.get(1));
        }
    }
}
