package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    Predator predator;

    Animal animal = new Animal();

    public Lion(Predator predator){
        this.predator=predator;
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }



    public int getKittens() {
        return predator.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return animal.getFood("Хищник");
    }

}
