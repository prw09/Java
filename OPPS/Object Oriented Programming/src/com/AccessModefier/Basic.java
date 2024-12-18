package com.AccessModefier;

public class Basic {
    protected int num;
    String name;
    int [] arr;

    public int getNum(){
        return num;
    }

    public Basic(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
