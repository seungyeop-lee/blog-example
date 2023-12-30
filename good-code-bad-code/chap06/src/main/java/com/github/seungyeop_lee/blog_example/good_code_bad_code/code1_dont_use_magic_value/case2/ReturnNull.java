package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_dont_use_magic_value.case2;

import java.util.List;

public class ReturnNull {

    GameLevel getEasiestLevel(List<GameLevel> levels) {
        GameLevel easiestLevel = null;
        Integer highestMinScore = null;
        for (GameLevel level : levels) {
            Integer minScore = minValue(level.getAllScores());
            if (highestMinScore == null || (minScore != null && minScore > highestMinScore)) {
                easiestLevel = level;
                highestMinScore = minScore;
            }
        }
        return easiestLevel;
    }

    Integer minValue(List<Integer> values) {
        if (values.isEmpty()) {
            return null;
        }

        int minValue = Integer.MAX_VALUE;
        for (Integer value : values) {
            minValue = Math.min(value, minValue);
        }
        return minValue;
    }

    private interface GameLevel {
        List<Integer> getAllScores();
    }
}
