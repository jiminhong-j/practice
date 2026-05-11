import java.util.Scanner;

public class Palindrome2 {
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

        if(palindrome(text)) {
            System.out.println("YES!! the phrase is a palindrome!");
        } else {
            System.out.println("NO!! the phrase is not a palindrome!");
        }
    }

    public static boolean palindrome(String text) {
        text = text.substring(0, text.length() - 1);
        text = text.toLowerCase();

        String newText = "";

        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if(c != ' ') {
                newText += c;
            }
        }

        for(int i = 0; i < newText.length() / 2; i++) {
            if(newText.charAt(i) != newText.charAt(newText.length() - 1 - i))
                return false;
        }

        return true;
    }
}




