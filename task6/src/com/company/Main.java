package com.company;

public class Main {

    public static void main(String[] args) {
        int countSeconds = 7623;
        Day day = new Day(countSeconds);
        day.showHours();
        day.showMinutes();
        day.showSeconds();
    }
}
