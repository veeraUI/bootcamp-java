package MotorBike;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike Honda = new MotorBike(100);
        MotorBike Harley = new MotorBike(50);
        MotorBike American = new MotorBike();

        Honda.start();
        Honda.decrementSpeed(1);
        Harley.start();
        Honda.printSpeed();
        American.start();
    }
}
