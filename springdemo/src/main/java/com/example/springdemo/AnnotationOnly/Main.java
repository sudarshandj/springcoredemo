package com.example.springdemo.AnnotationOnly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static ApplicationContext context;
    public static void main(String[] args) {
        //context = new ClassPathXmlApplicationContext("beans_annotationonly.xml");
        context = new AnnotationConfigApplicationContext(ConfigClass.class);
        Company company = context.getBean("company",Company.class);
        company.showInfo();
        company.engineer.development();
    }
}
