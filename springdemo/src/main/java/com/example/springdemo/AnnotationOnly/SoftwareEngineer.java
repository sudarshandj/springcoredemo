package com.example.springdemo.AnnotationOnly;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SoftwareEngineer implements Engineer {

    public void development(){
        System.out.println("software development....");
    }
}
