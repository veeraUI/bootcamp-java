package MotorBike;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike Honda = new MotorBike();
        MotorBike Harley = new MotorBike();
        MotorBike American = new MotorBike();
        Honda.setSpeed(100);
        Harley.setSpeed(20);
        American.setSpeed(50);

        Honda.start();
        Honda.decrementSpeed(1);
        Harley.start();
        Honda.printSpeed();
        American.start();
    }
}
