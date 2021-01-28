package com.company;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getDistance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public void comparePoints(Point point) {
        if (this.getDistance() < point.getDistance()) {
            System.out.println("The first point is nearer than second");
        } else {
            System.out.println("The second point is nearer than first");
        }
    }
}
