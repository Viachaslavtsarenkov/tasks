package com.task;

public class Task6 {

   static public int showHours(int seconds) {
        return (seconds / 3600);
    }

    static public int showMinutes(int seconds) {
        return (seconds % 3600) / 60;
    }

    static public int showSeconds(int seconds) {
        return (seconds % 3600) % 60;
    }

}
