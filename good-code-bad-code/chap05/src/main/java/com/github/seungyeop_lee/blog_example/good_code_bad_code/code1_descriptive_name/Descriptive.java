package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_descriptive_name;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Descriptive {

    private static class Team {
        Set<String> playerNames = new HashSet<>();
        Integer score = 0;

        Boolean containsPlayer(String playerName) {
            return playerNames.contains(playerName);
        }

        Integer getScore() {
            return score;
        }
    }

    Integer getTeamScoreForPlayer(List<Team> teams, String playerName) {
        for (Team team : teams) {
            if (team.containsPlayer(playerName)) {
                return team.getScore();
            }
        }

        return null;
    }
}
