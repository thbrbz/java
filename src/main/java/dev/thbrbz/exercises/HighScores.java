package dev.thbrbz.exercises;

import java.util.Collections;
import java.util.List;

class HighScores {

    private List<Integer> scores;

    public HighScores(List<Integer> highScores) {
        this.scores = highScores;
    }

    List<Integer> scores() {
        return scores;
    }

    Integer latest() {
        return scores.getLast();
    }

    Integer personalBest() {
        return Collections.max(scores);
    }

    List<Integer> personalTopThree() {
        return scores.stream().sorted(Collections.reverseOrder()).limit(3).toList();
    }

}
