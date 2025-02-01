package dev.thbrbz.exercises.resistorColor;

import java.util.Arrays;
import java.util.List;

class ResistorColorDuo {

    int value(String[] colors) {
        List<String> listColors = Arrays.asList("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");
        return listColors.indexOf(colors[0]) * 10 + listColors.indexOf(colors[1]);
    }
}
