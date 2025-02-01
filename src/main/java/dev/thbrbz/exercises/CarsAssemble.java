package dev.thbrbz.exercises;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double success;

        if (speed <= 4) {
            success = 1.0;
        } else if (speed <= 8) {
            success = 0.9;
        } else if (speed == 9) {
            success = 0.8;
        } else {
            success = 0.77;
        }

        return success * speed * 221.0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(this.productionRatePerHour(speed) / 60);
    }

}
