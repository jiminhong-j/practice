package j052.model;
import java.util.*;
import j052.model.Student;

public class Score {
    int count;
    private Student[] students;

    public Score(int count){
        this.count = count;
        students = new Student[count];

        for(int i = 0; i < count; i++){
            students[i] = new Student();
        }
    }

    public void getScore(){
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < count; i++){
            int kor = s.nextInt();
            int eng = s.nextInt();
            int math = s.nextInt();

            students[i].setScore(kor, eng, math);
        }
    }

    public void printScore(){
        for(int i = 0; i < count; i++){
            System.out.println(i+1 + "번 학생");
            students[i].print();

        }
    }

}
