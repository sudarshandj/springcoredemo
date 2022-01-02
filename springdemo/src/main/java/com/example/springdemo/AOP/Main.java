package com.example.springdemo.AOP;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Keys{
    public void run(Engine key){
        key.start();
    }
}

public class Main {
    public static void main(String[] args) {
        /*new Keys().run(new Car()); */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_aop.xml");
        //Car key = (Car) context.getBean("engine");//Tightly coupled
        //Car key = context.getBean("engine",Car.class);//Tightly coupled
        Engine key = (Engine) context.getBean("engine");//Loosely coupled
        new Keys().run(key);
    }
}


