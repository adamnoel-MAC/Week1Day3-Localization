package com.mobileapps.week1day3trainexample.model;

import android.util.Log;

public class Bird {
    private String reproduction = "egg";
    private String outerCovering = "feather";

    public String getReproduction() {
        return reproduction;
    }

    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }

    public String getOuterCovering() {
        return outerCovering;
    }

    public void setOuterCovering(String outerCovering) {
        this.outerCovering = outerCovering;
    }

    public void flyup(){
        System.out.println("Flying up...");
    }

    public void flydown(){
        System.out.println("Flying down...");
    }
}
