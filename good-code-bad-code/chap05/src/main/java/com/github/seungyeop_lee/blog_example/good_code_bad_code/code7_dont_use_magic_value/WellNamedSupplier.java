package com.github.seungyeop_lee.blog_example.good_code_bad_code.code7_dont_use_magic_value;

public class WellNamedSupplier {

    private static class Vehicle {

        Double getMassUsTon() {
            return 0.0;
        }

        Double getSpeedMph() {
            return 0.0;
        }

        // 차량의 현재 운동에너지를 줄 단위로 반환한다.
        Double getKineticEnergyJ() {
            return 0.5 *
                    getMassUsTon() * kilogramsPerUsTon() *
                    Math.pow(getSpeedMph() * meterPerSecondPerMph(), 2);
        }

        private static double kilogramsPerUsTon() {
            return 907.1847;
        }

        private static double meterPerSecondPerMph() {
            return 0.44704;
        }
    }
}
