package com.AccessModefier;

public class SubClass extends Basic{
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(34, "piyush");
        int n = obj.num;
    }
}
