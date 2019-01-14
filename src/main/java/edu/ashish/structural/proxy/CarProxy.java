package edu.ashish.structural.proxy;

public class CarProxy implements Drivable {

    private Driver driver;

    private Car car;

    public CarProxy(Driver driver) {
        this.driver = driver;
        car = new Car(driver);
    }

    @Override
    public void drive() {
        if(driver.getAge() < 18) {
            System.out.println("Too young to drive as age is below 18");
            return;
        }
        car.drive();
    }
}
