package com.example.springdemo.autowire;

import com.example.springdemo.dependance.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
    @Autowired
    @Qualifier("dept2")
    Dept dept;

    public void companywork(){
        if (dept == null)
            System.out.println("To client no work");
        else
            dept.work();
    }
}
