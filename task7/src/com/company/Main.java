package com.company;
import java.util.Scanner;
import com.points.Point;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите координаты для двух точек");
        try {
            double x1 = reader.nextDouble();
            double y1 = reader.nextDouble();
            double x2 = reader.nextDouble();
            double y2 = reader.nextDouble();
            Point firstPoint = new Point(x1, y1);
            Point secondPoint = new Point(x2, y2);
            firstPoint.comparePoints(secondPoint);
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
