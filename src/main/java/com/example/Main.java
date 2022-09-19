package com.example;

public class Main {
    public static void main(String[] args) throws Exception {

        WildСat feline = new Feline();

        Lion lion = new Lion(feline);

        System.out.println("У Льва " + lion.getKittens() + " львёнок");

    }
}
