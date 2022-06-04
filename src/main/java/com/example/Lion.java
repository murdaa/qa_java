package com.example;

public class Lion {

    private static Feline feline;
    boolean hasMane;

    public Lion(Feline feline) {
        this.feline = feline;
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

    public boolean doesHaveMane() {
        return hasMane;
    }

    public static void main(String[] args) throws Exception {

        Lion lion = new Lion(feline);
        lion.getInfoFromFeline();
    }

    public void getInfoFromFeline() throws Exception {
        feline.getKittens();
        feline.getFood("Хищник");
    }
}

