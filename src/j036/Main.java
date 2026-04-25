package j036;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String result = "";
        // 입력받는 문장에서 알파벳만 골라서 새로운 문자열 만들기
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(c >= 'a' && c <= 'z'){
                result += c;
            }
        }
        boolean isPalindrome = true;
        for(int i = 0; i < result.length() / 2; i++){
            if(result.charAt(i) != result.charAt(result.length() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
