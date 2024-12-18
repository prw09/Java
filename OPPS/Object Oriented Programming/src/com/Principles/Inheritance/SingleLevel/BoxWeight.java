package com.Principles.Inheritance.SingleLevel;

public class BoxWeight extends Box{
    double Weight;

    public BoxWeight() {

        this.Weight = -1;
    }

    public BoxWeight(double length, double height, double width, double weight) {
        super(length, height, width);
//        Calling the construct from the parent class
//        used to internalize values from parent class
        Weight = weight;
    }

    @Override
    public boolean info() {
        super.info();
        return false;
    }
}
