package com.Introduction1;

public class Constructors {
    public static void main(String[] args) {
//        Complex complex = new Complex();
//        complex.print();
          Complex men = new Complex();
          men.salary = 1000000;
          men.cellNumber = 999999999;
          men.age = 24;
          men.print();
    }
}

class Complex{
    int a;
    int b;
    int c;
    int age;
    int salary;
    int cellNumber;

//    public Complex(){
//        this.a = 1;
//        this.b = 1;
//        this.c = 1;
//    }
    public Complex(){
        this.age = age;
        this.salary = salary;
        this.cellNumber = cellNumber;
    }
    void print(){
        System.out.println(age + " " + cellNumber + " " + salary + " ");
    }
}