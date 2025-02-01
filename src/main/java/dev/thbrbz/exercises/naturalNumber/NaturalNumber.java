package dev.thbrbz.exercises.naturalNumber;

import java.util.stream.IntStream;

class NaturalNumber {

    private final int number;

    NaturalNumber(int number) {
        if (number < 1)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");

        this.number = number;
    }

    Classification getClassification() {
        int sum = IntStream.range(1, this.number)
                .filter(n -> number % n == 0)
                .sum();

        if (sum > this.number) return Classification.ABUNDANT;
        else if (sum == this.number) return Classification.PERFECT;
        else return Classification.DEFICIENT;
    }
}
