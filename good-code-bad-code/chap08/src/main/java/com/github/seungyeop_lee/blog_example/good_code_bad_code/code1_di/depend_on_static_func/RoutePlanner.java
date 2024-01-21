package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.depend_on_static_func;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.common_stub.Junction;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.common_stub.LatLong;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.common_stub.Road;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.common_stub.Route;

import java.util.List;

class RoutePlanner {

    Route planRoute(LatLong startPoint, LatLong endPoint) {
        List<Road> roads = NorthAmericaRoadMap.getRoads();
        List<Junction> junctions = NorthAmericaRoadMap.getJunctions();
        return null;
    }
}
