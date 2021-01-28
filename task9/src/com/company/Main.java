package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.shapes.Circle;
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println(" Введите радиус");
        try {
            int radius = reader.nextInt();
            Circle circleShape = new Circle(radius);
            System.out.printf("Длинна окружности %.3f\n", circleShape.getLengthCircle());
            System.out.printf("Площадь круга %.3f",circleShape.getAreaCircle());
        } catch (InputMismatchException e) {
            System.out.println(e);
        }


    }
}
