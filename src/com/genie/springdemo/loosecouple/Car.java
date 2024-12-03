package com.genie.springdemo.loosecouple;

/*
 this class is a "is-a" relationship
 */

public class Car {

    IEngine engine;

    Car(IEngine engine){

        this.engine=engine;
        System.out.println(engine);
    }

    public void drive(){

        int start = engine.start();
        if(start >= 1){
            System.out.println("Engine started...");
        }
        else {
            System.out.println("Engine in trouble....");
        }
    }
}
