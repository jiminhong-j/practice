package j032;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();

        System.out.println(reverse);
    }
}
