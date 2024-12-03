package com.genie.springdemo.DI;

import com.genie.springdemo.loosecouple.PetrolEngine;

import java.lang.reflect.Field;

public class TestMain {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {

//        CarDI car = new CarDI();
//        car.setEngine(new PetrolEngine());
//        car.drive();


        // reflection API
        Class<?> aClass = Class.forName("com.genie.springdemo.DI.CarDI");
        Field field = aClass.getDeclaredField("engine");
        field.setAccessible(true);

        Object instance = aClass.newInstance();
        CarDI carDI = (CarDI) instance;

        field.set(carDI,new PetrolEngine());
        carDI.drive();

    }
}
