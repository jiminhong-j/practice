package Rep06_1;

public class Temperature01 {
    // 멤버 변수
    private double temperature;
    private char unit;

    // 기본 생성자: 온도를 0도, 단위를 'C'(섭씨)로 초기화한다
    public Temperature01(){
        temperature = 0.0;
        unit = 'C';
    }

    // 온도 지정 생성자: 사용자가 온도만 지정할 때 해당 온도를 섭씨로 결정한다
    public Temperature01(double temperature){
        this.temperature = temperature;
        unit = 'C';
    }

    // 출력 메소드: 현재 온도와 단위를 출력한다
    public void writeOutput(){
        System.out.println("Temperature 01 = " + temperature + " degrees " + unit + ".");
    }
}