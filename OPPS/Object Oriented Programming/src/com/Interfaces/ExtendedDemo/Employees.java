package com.Interfaces.ExtendedDemo;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public interface Employees extends Company{

//    void OfficeEmployees();
//    void Office();

    default void OfficeEmployees(){
        System.out.println("OfficeEmployees");
    }
}
