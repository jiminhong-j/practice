package Rep06_3;

import java.util.Scanner;

public class Temperature03 {
    // 멤버 변수
    private double temperature;
    private char unit;

    // 기본 생성자: 온도를 0도, 단위를 'C'(섭씨)로 초기화한다
    public Temperature03(){
        temperature = 0.0;
        unit = 'C';
    }

    // 온도 지정 생성자: 사용자가 온도만 지정할 때 해당 온도를 섭씨로 결정한다
    public Temperature03(double temperature){
        this.temperature = temperature;
        unit = 'C';
    }

    // 단위 지정 생성자: 사용자가 단위만 지정할 경우, 온도는 0도로 설정하고 입력받은 단위를 사용한다
    public Temperature03(char unit){
        temperature = 0.0;
        this.unit = unit;
    }

    // 온도 및 단위 지정 생성자: 온도와 단위 모두를 사용자가 지정할 수 있다
    public Temperature03(double temperature, char unit){
        this.temperature = temperature;
        this.unit = unit;
    }

    // readInput() 메소드: 사용자로부터 온도와 단위를 입력받을 수 있도록 한다
    public void readInput(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a temperature (e.g., 29.6): ");
        temperature = s.nextDouble();

        System.out.print("Enter the unit ('C' for Celsius, 'F' for Fahrenheit): ");
        unit = s.next().charAt(0);
    }

    // 출력 메소드: 현재 온도와 단위를 출력한다
    public void writeOutput(){
        System.out.println("Temperature03 = " + temperature + " degrees " + unit + ".");
    }

    // 섭씨 출력 메소드: 온도를 섭씨로 출력한다. 화씨 온도는 섭씨로 변환하여 출력한다
    public void writeC(){
        double c;

        if((unit == 'C') || (unit == 'c')){
            c = temperature;
        } else {
            c = (temperature - 32) * 5.0 / 9.0;
        }

        System.out.printf("Temperature03 = %.1f degrees C.\n", c);
    }

    // 화씨 출력 메소드: 온도를 화씨로 출력한다. 섭씨 온도는 화씨로 변환하여 출력한다.
    public void writeF(){
        double f;

        if((unit == 'F') || (unit == 'f')){
            f = temperature;
        } else {
            f = temperature * 9.0 / 5.0 + 32;
        }

        System.out.printf("Temperature03 = %.1f degrees F.\n", f);
    }

    // 온도 가져오기: 현재 온도를 섭씨 또는 화씨로 반환한다
    public double getF(){

        if((unit == 'F') || (unit == 'f'))
            return temperature;
        else
            return temperature * 9.0 / 5.0 + 32;
    }

    public double getC(){

        if((unit == 'C') || (unit == 'c'))
            return temperature;
        else
            return (temperature - 32) * 5.0 / 9.0;
    }

    // 온도 설정 메소드: 온도 또는 단위를 변경. 오버로드되어서 여러 버전으로 구현됨
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }

    public void setUnit(char unit){
        this.unit = unit;
    }

    // 비교 메소드: 두 온도 객체를 비교하여 동등함, 크거나 작음을 평가한다

}