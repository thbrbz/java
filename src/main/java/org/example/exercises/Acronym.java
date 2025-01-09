package org.example.exercises;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Acronym {

    private final String value;

    public Acronym(String phrase) {
        value = Arrays.stream(phrase
                    .replaceAll("[^a-zA-Z\\s-]", "")
                    .split("[^a-zA-Z]"))
                    .filter(w -> !w.isEmpty())
                    .map(w -> String.valueOf(w.charAt(0)).toUpperCase())
                    .collect(Collectors.joining());
    }

    public String get() {
        return value;
    }

}
