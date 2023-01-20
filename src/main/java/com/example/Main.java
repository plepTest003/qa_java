package com.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, true);
        Lion lion1 = new Lion(feline, "Самка");
        lion.getKittens();
        lion.getFood();
        lion1.doesHaveMane();
    }
}
