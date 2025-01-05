package org.example.exercises.resistorColor;

import java.util.HashMap;
import java.util.Map;

public class ResistorColorTrio {
    private final Map<String, Integer> colorsHash = new HashMap<>() {{
        put("black", 0);
        put("brown", 1);
        put("red", 2);
        put("orange", 3);
        put("yellow", 4);
        put("green", 5);
        put("blue", 6);
        put("violet", 7);
        put("grey", 8);
        put("white", 9);
    }};

    String label(String[] colors) {
        String result;

        long value = (10L * colorsHash.get(colors[0]) + colorsHash.get(colors[1])) *
                ((long) Math.pow(10, colorsHash.get(colors[2])));

        if (value >= 1_000_000_000) return value / 1_000_000_000 + " gigaohms";
        else if (value >= 1_000_000 ) return value / 1_000_000 + " megaohms";
        else if (value >= 1_000 ) return value / 1_000 + " kiloohms";
        else return value+ " ohms";
    }
}
