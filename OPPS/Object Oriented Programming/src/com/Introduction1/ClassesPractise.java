package com.Introduction1;

public class ClassesPractise {

    public static void main(String[] args) {

        Car car = new Car();
        car.CarName= "Audi";
        car.NumberPlate = "0001";
        car.CompanyName = "Audi";
        car.Model = "X1";
        car.Message();

    }
}

class Car{
    String CarName;
    String Model;
    String CompanyName;
    String NumberPlate;

    void Message(){
        System.out.println("CarName is "+ CarName + " ,Model" + Model + " ,CompanyName" + CompanyName + " and NumberPlate " + NumberPlate);
    }
}
