package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.hardcording;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.common_stub.LatLong;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.common_stub.RoadMap;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.common_stub.Route;

class RoutePlanner {

    private final Boolean USE_ONLINE_MAP = true;
    private final Boolean INCLUDE_SEASONAL_ROADS = false;

    private final RoadMap roadMap;

    RoutePlanner() {
        this.roadMap = new NorthAmericaRoadMap(USE_ONLINE_MAP, INCLUDE_SEASONAL_ROADS);
    }

    Route planRoute(LatLong startPoint, LatLong endPoint) {
        //logic
        return null;
    }
}
