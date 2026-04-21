package j041.model;

import java.util.*;

public class Lotto {
    int[] numbers;
    private Random random = new Random();

    public Lotto(){
        numbers = new int[6];
        remakeAuto();
    }

    public void printNumbers(){
        Arrays.sort(numbers);
        for(int i = 0; i < 6; i++){
            System.out.println(numbers[i] + " ");
        }
    }

    public void remakeAuto(){
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(45) + 1;

            for(int j = 0; j < i; j++){
                if(numbers[i] == numbers[j]){
                    i--;
                    break;
                }
            }
        }
    }
}
