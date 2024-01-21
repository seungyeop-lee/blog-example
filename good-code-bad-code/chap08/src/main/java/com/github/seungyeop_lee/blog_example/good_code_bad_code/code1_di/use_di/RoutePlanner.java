package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.use_di;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.common_stub.LatLong;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.common_stub.RoadMap;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.common_stub.Route;

class RoutePlanner {

    private final RoadMap roadMap;

    RoutePlanner(RoadMap roadMap) {
        this.roadMap = roadMap;

    }

    Route planRoute(LatLong startPoint, LatLong endPoint) {
        //logic
        return null;
    }
}
