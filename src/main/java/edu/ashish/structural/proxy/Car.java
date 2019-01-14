package edu.ashish.structural.proxy;

public class Car implements Drivable {

    private Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        System.out.println("Driving the car");
    }
}
