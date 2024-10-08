import java.util.List;
import java.util.Collections;

public interface RemoteControlCar {
    void drive();
    int getDistanceTravelled();
}

public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int distanceTravelled;

    public void drive() {
        this.distanceTravelled += 20;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }
}

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTravelled;
    private int numberOfVictories;

    public void drive() {
        this.distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar prc) {
        if (this.getNumberOfVictories() > prc.getNumberOfVictories()) return -1;
        if (this.getNumberOfVictories() < prc.getNumberOfVictories()) return 1;
        return 0;
    }
}

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        Collections.sort(cars);
        return cars;
    }
}
