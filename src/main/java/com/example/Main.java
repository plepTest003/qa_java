package com.example;

public class Main {
    public static void main(String[] args) {

        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        lion.getKittens();
    }
}
