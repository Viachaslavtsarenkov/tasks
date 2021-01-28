package com.company;
import com.days.Day;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        int countSeconds = 0;
        try {
            countSeconds = reader.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
        Day day = new Day(countSeconds);
        day.showHours();
        day.showMinutes();
        day.showSeconds();
    }
}
