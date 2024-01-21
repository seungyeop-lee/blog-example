package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_depend_on_interface.depend_on_interface;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_depend_on_interface.common_stub.Junction;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_depend_on_interface.common_stub.RoadMap;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_depend_on_interface.common_stub.Route;

public class RoutPlanner {

    private final RoadMap roadMap;

    public RoutPlanner(RoadMap roadMap) {
        this.roadMap = roadMap;
    }

    Route planRoute(Junction startPoint, Junction endPoint) {
        //logic
        return null;
    }
}
