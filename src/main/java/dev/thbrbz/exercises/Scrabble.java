package dev.thbrbz.exercises;

import java.util.HashMap;
import java.util.Map;

class Scrabble {

    private static final Map<Character, Integer> letterValue = new HashMap<>();
    private final String word;

    static {
        letterValue.put('A', 1);
        letterValue.put('E', 1);
        letterValue.put('I', 1);
        letterValue.put('O', 1);
        letterValue.put('U', 1);
        letterValue.put('L', 1);
        letterValue.put('N', 1);
        letterValue.put('R', 1);
        letterValue.put('S', 1);
        letterValue.put('T', 1);
        letterValue.put('D', 2);
        letterValue.put('G', 2);
        letterValue.put('B', 3);
        letterValue.put('C', 3);
        letterValue.put('M', 3);
        letterValue.put('P', 3);
        letterValue.put('F', 4);
        letterValue.put('H', 4);
        letterValue.put('V', 4);
        letterValue.put('W', 4);
        letterValue.put('Y', 4);
        letterValue.put('K', 5);
        letterValue.put('J', 8);
        letterValue.put('X', 8);
        letterValue.put('Q', 10);
        letterValue.put('Z', 10);
    }

    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        return this.word.chars()
                .mapToObj(i -> (char)i)
                .map(letterValue::get)
                .reduce(0, Integer::sum);
    }

}
