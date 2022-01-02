package com.example.springdemo.literalinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{

    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("beans_literalinj.xml");
        Employee e = context.getBean("employee",Employee.class);
        e.showDetails();
        //System.out.println("Details as below: \n"+e);
    }
}
