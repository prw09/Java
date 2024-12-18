package com.Interfaces.CarExample;

public class Car implements Engine, Brake, Media{

    static int a = 30;
    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I acc like a normal car");
    }

}
