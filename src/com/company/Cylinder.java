package com.company;

public class Cylinder extends Circle {
    public double height = 5;

    public Cylinder() {

    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public  double getVolume(){
        return this.height*getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
