package com.task;

public class Task7 {

    public static double getDistance(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static void comparePoints(int x1, int y1, int x2, int y2) {
        if (getDistance(x1, y1) < getDistance(x2, y2)) {
            System.out.println("The first point is nearer than second");
        } else {
            System.out.println("The second point is nearer than first");
        }
    }
}
