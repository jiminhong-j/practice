package j030;

import j030.model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    public void run(){
        Scanner s = new Scanner(System.in);

        String[] names = {"James", "David", "Simon", "Peter", "Jason"};
        int[] answer = {1, 2, 3, 4, 1, 2, 3, 4, 3, 2};

        Student[] students = createStudents(names);
        inputStudents(students, s);
        processStudents(students, answer);
        printAll(students);
    }

    public Student[] createStudents(String[] names){
        Student[] students = new Student[names.length];
        for(int i = 0; i < names.length; i++){
            students[i] = new Student(names[i]);
        }
        return students;
    }

    public void inputStudents(Student[] students, Scanner s){
        for(int i = 0; i < students.length; i++){
            for(int j = 0; j < 10; j++){
                students[i].setAnswer(j, s.nextInt());
            }
        }
    }

    public void processStudents(Student[] students, int[] answer){
        for (int i = 0; i < students.length; i++){
            students[i].checkAnswers(answer);
            students[i].setGrade();
        }
    }

    public void printAll(Student[] students){
        printGrade(students, 1, "1st");
        printGrade(students, 2, "2nd");
        printGrade(students, 3, "3rd");
    }

    public void printGrade(Student[] students, int target, String title){
        int count = 0;
        System.out.print(title + " : ");
        for(int i = 0; i < students.length; i++){
            if(students[i].getGrade() == target){
                System.out.print(students[i].getName() + " ");
                count++;
            }
        }

        System.out.println("(" + count + ")");
    }
}
