package dev.thbrbz.exercises;

public class CollatzCalculator {

    int computeStepCount(int start) {
        if (start < 1)
            throw new IllegalArgumentException("Only positive integers are allowed");

        int count = 0;
        while (start > 1) {
            count++;
            if (start % 2 == 0) {
                start = start / 2;
            } else {
                start = (start * 3) + 1;
            }
        }

        return count;
    }

}
