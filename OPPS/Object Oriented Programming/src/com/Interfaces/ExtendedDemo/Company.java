package com.Interfaces.ExtendedDemo;

public interface Company {
    default void Office(){
        System.out.println("Company");
    };

//    void Office(){};
}
