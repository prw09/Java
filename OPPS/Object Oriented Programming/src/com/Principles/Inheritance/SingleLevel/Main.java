package com.Principles.Inheritance.SingleLevel;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(6);
        Box box1 = new Box(2.5,6.5,7.4);
        Box box2 = new Box();
//        System.out.println(box.Length + " " + box.Height+ " " + box.Weight);
//        System.out.println(box1.Length + " " + box1.Height+ " " + box1.Weight);
//        System.out.println(box2.Length + " " + box2.Height+ " " + box2.Weight);

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.info());
    }
}
