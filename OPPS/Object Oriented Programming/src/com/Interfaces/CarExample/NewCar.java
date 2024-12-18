package com.Interfaces.CarExample;

public class NewCar{

    private Engine engine;
    private Media media = new CdPlayer();
    public NewCar(Engine engine) {
        this.engine = engine;
    }
    public NewCar(){
        engine = new PowerEngine();
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        media.start();
    }
    public void stopMusic(){
        media.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
