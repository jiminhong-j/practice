package ex2.model;

import java.util.Scanner;

public class BmiCalculator {
    public int height, weight;
    public double bmi;

    public BmiCalculator(){
        input();
    }

    void input(){
        Scanner s = new Scanner(System.in);
        height = s.nextInt();
        weight = s.nextInt();
        bmi = getBmi();
    }

    double getBmi(){
        return (weight) / (height * 0.01 * height * 0.01);
    }
}
