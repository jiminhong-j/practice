package Rep02;

import java.util.Scanner;

public class Rep02Replace3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a line of text.");
            String text = s.nextLine();

            if(text.equals("quit")){
                break;
            }

            String lowerLine = text.toLowerCase();
            int index = lowerLine.indexOf("hate");
            text = text.substring(0, index) + "love" + text.substring(index + 4);


            System.out.println("I have rephrased that line to read:");
            System.out.println(text);
        }
    }
}
