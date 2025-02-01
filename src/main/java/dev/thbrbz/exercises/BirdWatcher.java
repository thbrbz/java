package dev.thbrbz.exercises;

import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length -1] ++;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).filter(value -> value > 0)
            .count() != 7;
    }

    public int getCountForFirstDays(int numberOfDays) {
        return Arrays.stream(birdsPerDay)
            .limit(numberOfDays)
            .sum();
    }

    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay)
            .filter(value -> value >= 5)
            .count();
    }
}
