package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_dont_use_magic_value.case2;

import java.util.List;

public class ReturnMagicNumber {

    GameLevel getEasiestLevel(List<GameLevel> levels) {
        GameLevel easiestLevel = null;
        Integer highestMinScore = null;
        for (GameLevel level : levels) {
            int minScore = minValue(level.getAllScores());
            if (highestMinScore == null || minScore > highestMinScore) {
                easiestLevel = level;
                highestMinScore = minScore;
            }
        }
        return easiestLevel;
    }

    int minValue(List<Integer> values) {
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
