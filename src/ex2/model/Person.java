package ex2.model;

public class Person {
    private int height, weight;
    private double bmi;

    public Person(int height, int weight){
        this.height = height;
        this.weight = weight;
        bmiCalculator();
    }

    private double bmiCalculator(){
        bmi = weight / (height * 0.01 * height * 0.01);

        return bmi;
    }

    public double getBmi(){
        return bmi;
    }
}
