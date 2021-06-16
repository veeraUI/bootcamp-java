package MotorBike;

public class MotorBike {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void printSpeed() {
        System.out.printf("Speed of the Bike: %d", getSpeed()).println();
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void decrementSpeed(int decrementValue) {
        setSpeed(getSpeed() - decrementValue);
    }

    void start() {
        System.out.println("Bike has started");
        System.out.printf("Speed of the Bike: %d", speed).println();
    }
}
