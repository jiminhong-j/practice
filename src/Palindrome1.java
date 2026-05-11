import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String text;

        while(true) {
            System.out.println("This program will test whatever text");
            System.out.println("you enter to see if is a palindrome");
            System.out.println("(reads the same backwards and forwards).");
            System.out.println();

            System.out.println("Enter text (just letters and blanks, please):");
            text = s.nextLine();

            if(!text.endsWith(".")) {
                System.out.println("Your sentence does not end with a period.");
            }

            if(text.length() >= 80) {
                System.out.println("Your sentence length is over 80.");
            }

            System.out.println();

            if(text.endsWith(".") && text.length() < 80) {
                break;
            }
        }
    }
}
