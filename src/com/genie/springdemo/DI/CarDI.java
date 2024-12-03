package com.genie.springdemo.DI;

/*
 this class is a "is-a" relationship
 */

import com.genie.springdemo.loosecouple.IEngine;

public class CarDI {

   private IEngine engine;

//    public void setEngine(IEngine engine) {
//        this.engine = engine;
//    }

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
