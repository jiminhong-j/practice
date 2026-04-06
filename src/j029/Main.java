package j029;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().j029();
    }

    public void j029(){
        //입력 받기
        Scanner s = new Scanner(System.in);

        int[] number = new int[10];

        for(int i = 0; i < number.length; i++){
            System.out.print("Enter #" + (i+1) + " number > ");
            number[i] = s.nextInt();

            //중복 숫자
            for(int j = 0; j < i; j++){
                if(number[i] == number[j]){
                    System.out.println("Duplicated! Retry.");
                    i--;
                    break;
                }
            }
        }
        //출력
        System.out.print("Numbers - ");
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
}