package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.use_di;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.common_stub.Junction;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.common_stub.Road;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.common_stub.RoadMap;

import java.util.List;

class EuropeRoadMap implements RoadMap {
    @Override
    public List<Road> getRoads() {
        return null;
    }

    @Override
    public List<Junction> getJunctions() {
        return null;
    }
}
