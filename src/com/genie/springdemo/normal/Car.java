package com.genie.springdemo.normal;


/*
 this class is a "is-a" relationship
 */
public class Car extends Engine{

    public void drive(){

        // start engine

        int start = super.start();
        if (start >= 1){
            System.out.println("Engine started.....");
        }
    }
}
