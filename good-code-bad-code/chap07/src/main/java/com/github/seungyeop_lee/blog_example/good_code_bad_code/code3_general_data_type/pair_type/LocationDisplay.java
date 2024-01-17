package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_general_data_type.pair_type;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_general_data_type.stub.DrawableMap;

import java.util.List;

class LocationDisplay {
    private final DrawableMap map;

    public LocationDisplay(DrawableMap map) {
        this.map = map;
    }

    /**
     * 지도 위에 제공된 좌표의 모든 위치를 표시한다.
     * <p>
     * 페어의 리스트를 받아들이는데, 각 페어는 하나의 위치를 나타낸다.
     * 페어에서 첫 번째 값은 위도이고, 두 번째 값은 경도를 나타낸다.
     * (둘 다 각도 값)
     */
    void markLocationsOnMap(List<Pair<Double, Double>> locations) {
        for (Pair<Double, Double> location : locations) {
            map.markLocation(
                    location.getFirst(),
                    location.getSecond()
            );
        }
    }

}
