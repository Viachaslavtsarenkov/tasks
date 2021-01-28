package com.points;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY() { return this.y; }

    public double getDistance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public void comparePoints(Point point) {
        if (this.getDistance() < point.getDistance()){
            System.out.println("The first point is nearer than second");
        } else{
            System.out.println("The second point is nearer than first");
        }
    }
}
