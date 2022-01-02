package com.example.springdemo.dependance;

public class Bike {
    String color;

   /* public String getColor() {
        return color;
    }*/
    /*public Bike(){
        System.out.println("Object created....");
    }*/
    /*public Bike(String color){ //By constructor injection
        this.color = color;
    }*/
    /*public void setColor(String color) { //By Setter injection
        this.color = color;
        System.out.println("setter is called....");
    }
    */
    public void showColor(){
       System.out.println("your color is "+ color);
    }

    Engine engine;
    public Bike(Engine engine){
        this.engine = engine;
        System.out.println("I am constructor...");
    }

    public void startEngine(){
        if(engine==null){
            System.out.println("Unable start your engine!!");
        }else{
            engine.start();
        }
    }
}
