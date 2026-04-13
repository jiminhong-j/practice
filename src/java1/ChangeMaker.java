package java1;

import java.util.Scanner;

public class ChangeMaker {
    public static void main(String[] args){
        int amount;
        int originalAmount;
        int quarters;
        int dimes;
        int nickels;
        int pennies;

        System.out.println("Enter a whole number from 1 to 99.");
        System.out.println("I will find a combination of coins");
        System.out.println("that equals that amount of change.");

        Scanner s = new Scanner(System.in);
        amount = s.nextInt();

        originalAmount = amount;
        quarters = amount / 25;
        amount = amount % 25;
        dimes = amount / 10;
        amount = amount % 10;
        nickels = amount / 5;
        amount = amount % 5;
        pennies = amount;

    }
}
