package java1;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args){
        System.out.println("Enter nonnegative numbers, one per line.");
        System.out.println("Place a negative number at the end");
        System.out.println("to serve as an end marker.");

        int next, sum = 0;
        boolean numbersLeft = true;
        Scanner keyboard = new Scanner(System.in);
        while(numbersLeft){
            next = keyboard.nextInt();
            if(next < 0){
                numbersLeft = false;
            } else {
                sum = sum + next;
            }
        }
        System.out.println("The sum of the numbers is " + sum);
    }
}
