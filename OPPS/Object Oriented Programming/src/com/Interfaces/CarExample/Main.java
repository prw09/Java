package com.Interfaces.CarExample;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        car.start();
//        car.brake();

        NewCar newCar = new NewCar();
        newCar.start();
        newCar.startMusic();
        newCar.upgradeEngine();
        newCar.start();
    }
}
