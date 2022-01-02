package com.example.springdemo.literalinjection;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
    @Value("${employee.name}")
    private String empName;

    @Value("${employee.id}")
    private int empId;

    @Value("${employee.skills}")
    private String empOtherSkills;

    public void showDetails(){
        System.out.println("Employee Name is = "+empName);
        System.out.println("Employee Id ="+empId);
        System.out.println("Employee other skills = "+empOtherSkills);
    }
}
