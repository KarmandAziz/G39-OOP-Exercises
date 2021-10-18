package org.example;

public class Rectangle {

    private double height;
    private double width;

        //Constructors
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(){};

        //getter and setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return height*width;
    }
}
