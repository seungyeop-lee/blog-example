package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_depend_on_interface.depend_on_impl;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_depend_on_interface.common_stub.Junction;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_depend_on_interface.common_stub.Road;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_depend_on_interface.common_stub.RoadMap;

import java.util.List;

public class NorthAmericaRoadMap implements RoadMap {
    @Override
    public List<Road> getRoads() {
        return null;
    }

    @Override
    public List<Junction> getJunctions() {
        return null;
    }
}
