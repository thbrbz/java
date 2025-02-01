package dev.thbrbz.exercises;

class NeedForSpeed {
    public final int speed;
    public final int batteryDrain;
    public int distanceDriven;
    public int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (this.batteryDrained()) return;
        this.distanceDriven += speed;
        this.battery -= this.batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private final int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int totalDistanceCarCanRun = (car.battery / car.batteryDrain) * car.speed;
        return this.distance <= totalDistanceCarCanRun;
    }
}
