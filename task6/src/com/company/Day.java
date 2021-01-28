package com.company;

public class Day{

    private int hours;
    private int minutes;
    private int seconds;

    public Day(int seconds) {
        this.hours = seconds / 3600;
        this.minutes = (seconds % 3600) / 60;
        this.seconds = (seconds % 3600) % 60;
    }

    public void showHours() {
        System.out.println("Hours " + this.hours);
    }

    public void showMinutes() {
        System.out.println("Minutes " + this.minutes);
    }

    public void showSeconds() {
        System.out.println("Seconds " + this.seconds);
    }
}
