package com.genie.springdemo.loosecouple;

public class EngineFactory {

    public IEngine getInstance (String engineName) {
        if(engineName.equals("Petro")) {
            return new PetrolEngine();
        }
        else {
            return new DieselEngine();
        }
    }

}
