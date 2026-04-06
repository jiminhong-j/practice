package j030.model;

public class Student {
    private String name;
    private int[] sheet = new int[10];
    private int grade;
    private int score = 0;

    public Student(String name){
        this.name = name;
    }

    public void setAnswer(int index, int value){
        sheet[index] = value;
    }

    public void checkAnswers(int[] answer){
        for(int i = 0; i < 10; i++){
            if(sheet[i] == answer[i]){
                score++;
            }
        }
    }

    public void setGrade(){
        if(score >= 9) grade = 1;
        else if(score >= 7) grade = 2;
        else grade = 3;
    }

    public int getGrade(){
        return grade;
    }

    public String getName(){
        return name;
    }


}
