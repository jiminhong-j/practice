package j052.model;

public class Student {
    int kor, eng, math;
    int sum;
    double average;

    public void setScore(int kor, int eng, int math){
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        sum = kor + eng + math;
        average = sum / 3.0;
    }

    public String getGrade(){
        if(average >= 90) return "A";
        else if(average >= 80) return "B";
        else if(average >= 70) return "C";
        else if(average >= 60) return "D";
        else return "F";
    }

    public void print(){
        System.out.println("국어: " + kor + ", 영어: " + eng + ", 수학: " + math);
        System.out.println("총점: " + sum);
        System.out.printf("평균: %.1f", average);
        System.out.println("\n");
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
