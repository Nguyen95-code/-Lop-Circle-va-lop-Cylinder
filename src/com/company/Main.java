package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("circle co radius la :" + circle.radius + " va dien tich la " + circle.getArea());
        Cylinder cylinder = new Cylinder();
        System.out.println("Cylinder co radius :" + cylinder.radius + " ,the tich la: " + cylinder.getVolume());
    }
}
