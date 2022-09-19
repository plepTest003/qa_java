package com.example;

public class Main {
    public static void main(String[] args) throws Exception {


        WildСat feline = new Feline();
        Animal animal = new Animal();


        Lion lion = new Lion(feline);
        Lion lion1 = new Lion(animal);
        lion.getKittens();
        System.out.println("У Льва " + lion.getKittens() + " львёнок");
        lion1.getFood();
        System.out.println("Лев питаеться: " + lion1.getFood());

    }
}
