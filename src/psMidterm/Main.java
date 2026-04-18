package psMidterm;

import java.util.Scanner;
import psMidterm.model.Student;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 여기에 작성
        Student student = new Student();
        System.out.print("이름 입력: ");
        String name = s.nextLine();
        System.out.print("점수 입력: ");
        int score = s.nextInt();
        student.setStudent(name, score);
        student.printAll();
    }
}
