package ex2;

import ex2.model.BmiCalculator;
import java.util.Scanner;

public class Main {

    void run(){
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int people = 0;

        for(int i = 0; i <count; i++){
            BmiCalculator calculator = new BmiCalculator();
            if(calculator.bmi > 25)
                people++;
        }

        System.out.println(people);
    }

    public static void main(String[] args){
        Main main = new Main();
        main.run();
    }
}
