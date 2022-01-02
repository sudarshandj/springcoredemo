package com.example.springdemo.dependance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_depinject.xml");

        Bike bike = context.getBean("bike",Bike.class);
        bike.startEngine();

        Car car = context.getBean("car",Car.class);
        bike.startEngine();
    }
}
