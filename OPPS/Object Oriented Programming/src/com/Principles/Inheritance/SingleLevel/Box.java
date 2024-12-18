package com.Principles.Inheritance.SingleLevel;

public class Box {
    double Length;
    double Height;
    double Width;

    public Box(double length, double height, double width) {
        Length = length;
        Height = height;
        Width = width;
    }

    Box(){
        this.Length = -1;
        this.Height = -1;
        this.Width = -1;
    }

    Box(double side){
        this.Length = side;
        this.Height = side;
        this.Width = side;
    }

    Box(Box old){
        this.Length = old.Length;
        this.Height = old.Height;
        this.Width = old.Width;
    }

    public boolean info(){
        System.out.println("Welcome!");
        return false;
    }


}
