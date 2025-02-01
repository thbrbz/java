package dev.thbrbz.exercises;

import java.util.stream.IntStream;

public class Hamming {
    private int hammingDistance = 0;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("strands must be of equal length");

        this.hammingDistance = (int) IntStream
            .range(0, leftStrand.length())
            .filter(i -> leftStrand.charAt(i) != rightStrand.charAt(i))
            .count();
    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}
