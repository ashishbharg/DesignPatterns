package edu.ashish.structural.proxy;

public class ProxyDemo {

    public static void main(String[] args) {

        Driver driver = new Driver(10);
        Drivable car = new Car(driver);
        car.drive();

        Drivable proxyCar = new CarProxy(driver);
        proxyCar.drive();
    }
}
