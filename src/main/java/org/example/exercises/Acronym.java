package org.example.exercises;

import java.lang.Character;

public class Acronym {

    private final String value;

    Acronym(String phrase) {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (final char c : phrase.toCharArray()) {
            if (c == ' ' && sb.toString().endsWith(" ")) {
                continue;
            } else if (Character.toString(c).matches("[a-zA-Z]") || c == ' ') {
                sb.append(c);
            } else if (c == '-' && phrase.charAt(phrase.indexOf(c)+1) != ' ') {
                sb.append(' ');
            }
        }

        for (String s : sb.toString().split(" "))
            result.append(s.charAt(0));

        value = result.toString().toUpperCase();
    }

    String get() {
        return value;
    }

}
