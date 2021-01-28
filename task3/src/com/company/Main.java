package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите площадь");
        try {
            int firstArea = reader.nextInt();
            double secondArea = firstArea / 2;
            System.out.println("S2 = " + secondArea);
            System.out.printf("S1 > S2 в %s раза", (firstArea / secondArea));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
