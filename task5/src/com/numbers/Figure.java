package com.numbers;

public class Figure {
    int number;

    public Figure(int number){
        this.number = number;
    }

    public boolean isPerfect() {
        int sum = 0;
        for (int i = 1; i < this.number; ++i){
            if (this.number % i == 0){
                sum += i;
                if (sum > this.number){
                    return false;
                }
            }
        }
        return sum == this.number ? true : false;
    }
}
