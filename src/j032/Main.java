package j032;

import java.util.*;

public class Main {
    public static void main(String[] args){
        String str;
        String reverse = "";

        Scanner s = new Scanner(System.in);

        str = s.nextLine();

        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }

        System.out.println(reverse);
    }
}
