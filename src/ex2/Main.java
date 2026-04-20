package ex2;

import ex2.model.Person;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int height, weight;
        int people = 0;

        // 생성자
        Person[] p = new Person[count];

        for(int i = 0; i <count; i++){
            height = s.nextInt();
            weight = s.nextInt();
            p[i] = new Person(height, weight);

            if(p[i].getBmi() >= 25){
                people++;
            }
        }

        System.out.println(people);
    }
}
