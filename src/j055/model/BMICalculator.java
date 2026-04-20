package j055.model;

import java.util.Scanner;

public class BMICalculator {
    int height, weight;
    double bmi;
    int level;
    String name;

    public BMICalculator(){}

    public void getHW(){
        Scanner s = new Scanner(System.in);

        name = s.nextLine();
        height = s.nextInt();
        weight = s.nextInt();

        bmi = weight / (height * 0.01 * height * 0.01);

        if(bmi < 18.5) level = 1;
        else if(bmi < 25) level = 2;
        else if(bmi < 30) level = 3;
        else level = 4;
    }

    public void printBMI(){
        System.out.println("이름: " + name + "\n키: " + height + "\n몸무게: " + weight + "\n비만도: " + bmi);
    }
}
