package dev.thbrbz.exercises;

public class ElonsToyCar {

    private int battery = 100;
    private int metersDriven = 0;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.metersDriven);
    }

    public String batteryDisplay() {
        return (this.hasBattery()) ?
                String.format("Battery at %d%s", this.battery, "%") :
                "Battery empty";
    }

    public void drive() {
        if (this.hasBattery()) {
            this.battery -= 1;
            this.metersDriven += 20;
        }
    }

    private boolean hasBattery() {
        return this.battery > 0;
    }

}
