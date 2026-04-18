package psMidterm.model;

public class Student {
    String name;
    int score;

    public Student() {}

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void setStudent(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    public void printAll() {
        System.out.println("학생 이름: " + name);
        System.out.println("학생 점수: " + score);
    }
}