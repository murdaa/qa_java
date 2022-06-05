package com.example;

public class Example {
    public static void main(String[] args) throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, "Самец");
        feline.getKittens();
        feline.getFood("Хищник");
    }
}

