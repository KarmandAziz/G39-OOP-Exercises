package org.example;

public class Car {

    private int id;
    private int year;
    private String model;
    private String colour;
    private double motorSize;


    public Car(int id, int year, String model, String colour, double motorSize) {
        this.id = id;
        this.year = year;
        this.model = model;
        this.colour = colour;
        this.motorSize = motorSize;
    }

    public String drive(){
       return model + " with motor " + motorSize + " can drive now!";
    }
}



