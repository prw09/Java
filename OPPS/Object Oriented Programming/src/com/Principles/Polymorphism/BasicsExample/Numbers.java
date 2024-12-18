package com.Principles.Polymorphism.BasicsExample;

public class Numbers {
    int add(int a , int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a+ b + c;
    }
    float add(int a , int b, int d, int g){
        return a + b + d + g;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.add(2,3);
        num.add(5,9,1);
//        num.add(1);
    }
}
