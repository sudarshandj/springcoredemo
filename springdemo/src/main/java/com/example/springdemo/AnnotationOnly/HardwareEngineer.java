package com.example.springdemo.AnnotationOnly;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class HardwareEngineer implements Engineer{

    @Override
    public void development() {
        System.out.println("Hardware development...");
    }
}
