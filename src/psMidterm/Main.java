package psMidterm;

import java.util.*;
import psMidterm.model.Student;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 여기에 작성
        ArrayList<Student> list = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            Student student = new Student();
            System.out.print("이름 입력: ");
            String name = s.nextLine();
            System.out.print("점수 입력: ");
            int score = s.nextInt();
            s.nextLine();
            System.out.println();
            student.setStudent(name, score);
            list.add(student);
        }

        String find = s.nextLine();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName().equals(find)){
                System.out.println(find + "의 점수는 " + list.get(i).getScore() + "점입니다.");
            }
        }

    }
}
