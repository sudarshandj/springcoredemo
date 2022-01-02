package com.example.springdemo.springbootdemo;

import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop {
    public int id;
    public String brand;

    public Laptop() {
        System.out.println("Lap object crated");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    void show(){
        System.out.println("compiling...");
    }

    @Override
    public String toString() {
        return "Laptop{" +
            /*    "id=" + id +*/
                ", brand='" + brand + '\'' +
                '}';
    }
}
