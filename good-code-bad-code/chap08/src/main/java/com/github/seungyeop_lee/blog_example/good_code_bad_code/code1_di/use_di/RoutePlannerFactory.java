package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_di.use_di;

class RoutePlannerFactory {

    static RoutePlanner createEuropeRoutePlanner() {
        return new RoutePlanner(new EuropeRoadMap());
    }

    static RoutePlanner createDefaultNorthAmericaRoutePlanner() {
        return new RoutePlanner(new NorthAmericaRoadMap(true, false));
    }
}
