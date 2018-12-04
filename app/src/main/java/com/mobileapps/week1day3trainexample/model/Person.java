package com.mobileapps.week1day3trainexample.model;

public class Person extends Animal{

    public int numberOfPiercings;
    public int numberOfTatoos;

    public int getNumberOfPiercings() {
        return numberOfPiercings;
    }

    public void setNumberOfPiercings(int numberOfPiercings) {
        this.numberOfPiercings = numberOfPiercings;
    }

    public int getNumberOfTatoos() {
        return numberOfTatoos;
    }

    public void setNumberOfTatoos(int numberOfTatoos) {
        this.numberOfTatoos = numberOfTatoos;
    }
}
