package com.example.springdemo.AnnotationOnly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {

    @Value("${company.name}")
    String companyName;

    @Autowired
    @Qualifier("hardwareEngineer")
    Engineer engineer;


    /*public Company(SoftwareEngineer softwareEngineer){
        this.softwareEngineer = softwareEngineer;
        System.out.println("constructor called....");
    }


    public void setSoftwareEngineer(SoftwareEngineer softwareEngineer)  {
        this.softwareEngineer = softwareEngineer;
        System.out.println("setter called...");
    }*/

    public void showInfo(){
        System.out.println("Company show information...");
        System.out.println("Company name : " + companyName);
    }
}