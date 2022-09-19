package com.example;

import java.util.List;

public class Lion extends Animal{

    boolean hasMane;

    private WildСat wildСat;

    public Lion (WildСat wildСat){
        this.wildСat=wildСat;
    }
    private Animal animal;
    public Lion (Animal animal){
        this.animal=animal;
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
        return wildСat.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return animal.getFood("Хищник");
    }

}
