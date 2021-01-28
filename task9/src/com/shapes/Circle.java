package com.shapes;

public class Circle {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double getLengthCircle() {
        return 2 * Math.PI * radius;
    }

    public double getAreaCircle() {
        return Math.PI * Math.pow(radius, 2);
    }
}
