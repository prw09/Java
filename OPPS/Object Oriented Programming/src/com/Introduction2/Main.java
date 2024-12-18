package com.Introduction2;

public class Main {
    public static void main(String[] args) {
        Human piyush = new Human(23, "piyush",10000, false);
        Human ram = new Human(22, "ram",1000, false);
//        System.out.print("Name: " + piyush.name + " Age: " + piyush.age + " Salary: " + piyush.salary + " Married: " + piyush.married);

//        System.out.println(piyush.population);
//        System.out.println(ram.population);
//
//        access this like this not like above
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
