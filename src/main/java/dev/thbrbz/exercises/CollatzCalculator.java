package dev.thbrbz.exercises;

import java.util.stream.IntStream;

public class CollatzCalculator {

    int computeStepCount(int start) {
        if (start < 1)
            throw new IllegalArgumentException("Only positive integers are allowed");

        return (int) IntStream.iterate(start,
                num -> num != 1,
                num -> (num & 1) == 1 ? 3 * num + 1 : num >> 1)
                .count();
    }

}
