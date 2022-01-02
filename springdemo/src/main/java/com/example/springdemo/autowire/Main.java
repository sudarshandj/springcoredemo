package com.example.springdemo.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("beans_autowire.xml");

        Company company = context.getBean("company",Company.class);
        company.companywork();
    }

}