package com.example.springdemo.dependance;

public class Car {

    Engine engine;

    public Car(Engine engine){
        this.engine = engine;
        System.out.println("I am car constructor...");
    }

    public void showEngine(){
        if (engine == null){
            System.out.println("Unable to start your engine!!");
        }else{
            engine.start();
        }
    }
}
