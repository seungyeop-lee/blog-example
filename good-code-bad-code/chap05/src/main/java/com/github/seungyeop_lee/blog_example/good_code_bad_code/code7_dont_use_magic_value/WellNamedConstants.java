package com.github.seungyeop_lee.blog_example.good_code_bad_code.code7_dont_use_magic_value;

public class WellNamedConstants {

    private static class Vehicle {

        private final double KILOGRAMS_PER_US_TON = 907.1847;
        private final double METERS_PER_SECOND_PER_MPH = 0.44704;

        Double getMassUsTon() {
            return 0.0;
        }

        Double getSpeedMph() {
            return 0.0;
        }

        // 차량의 현재 운동에너지를 줄 단위로 반환한다.
        Double getKineticEnergyJ() {
            return 0.5 *
                    getMassUsTon() * KILOGRAMS_PER_US_TON *
                    Math.pow(getSpeedMph() * METERS_PER_SECOND_PER_MPH, 2);
        }
    }

}
