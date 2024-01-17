package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_general_data_type.specialized_type;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_general_data_type.stub.DrawableMap;

import java.util.List;

class LocationDisplay {
    private final DrawableMap map;

    public LocationDisplay(DrawableMap map) {
        this.map = map;
    }

    /**
     * 지도 위에 제공된 모든 좌표의 위치를 표시한다.
     **/
    void markLocationsOnMap(List<LatLong> locations) {
        for (LatLong location : locations) {
            map.markLocation(
                    location.getLatitude(),
                    location.getLongitude()
            );
        }
    }
}
