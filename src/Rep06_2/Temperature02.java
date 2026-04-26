package Rep06_2;

import java.util.Scanner;

public class Temperature02 {
    // 멤버 변수
    private double temperature;
    private char unit;

    // 기본 생성자: 온도를 0도, 단위를 'C'(섭씨)로 초기화한다
    public Temperature02(){
        temperature = 0.0;
        unit = 'C';
    }

    // 온도 지정 생성자: 사용자가 온도만 지정할 때 해당 온도를 섭씨로 결정한다
    public Temperature02(double temperature){
        this.temperature = temperature;
        unit = 'C';
    }

    // 단위 지정 생성자: 사용자가 단위만 지정할 경우, 온도는 0도로 설정하고 입력받은 단위를 사용한다
    public Temperature02(char unit){
        temperature = 0.0;
        this.unit = unit;
    }

    // 온도 및 단위 지정 생성자: 온도와 단위 모두를 사용자가 지정할 수 있다
    public Temperature02(double temperature, char unit){
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
        System.out.println("Temperature02 = " + temperature + " degrees " + unit + ".");
    }

    // 섭씨 출력 메소드: 온도를 섭씨로 출력한다. 화씨 온도는 섭씨로 변환하여 출력한다
    public void writeC(){
        double c;

        if((unit == 'C') || (unit == 'c')){
            c = temperature;
        } else {
            c = (temperature - 32) * 5.0 / 9.0;
        }

        System.out.printf("Temperature02 = %.1f degrees C.\n", c);
    }

    // 화씨 출력 메소드: 온도를 화씨로 출력한다. 섭씨 온도는 화씨로 변환하여 출력한다.
    public void writeF(){
        double f;

        if((unit == 'F') || (unit == 'f')){
            f = temperature;
        } else {
            f = temperature * 9.0 / 5.0 + 32;
        }

        System.out.printf("Temperature02 = %.1f degrees F.\n", f);
    }

}