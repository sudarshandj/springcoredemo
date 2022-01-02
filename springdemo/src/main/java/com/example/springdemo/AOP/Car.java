package com.example.springdemo.AOP;

public class Car implements Engine{
    @Override
    public void start() {
        System.out.println("Car has been started..");
    }
}
