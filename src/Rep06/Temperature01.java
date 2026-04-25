package Rep06;

public class Temperature01 {
    private double temperature;
    private char unit;

    public Temperature01(){
        temperature = 0.0;
        unit = 'C';
    }

    public Temperature01(double temperature){
        this.temperature = temperature;
        unit = 'C';
    }

    public void writeOutput(){
        System.out.println("Temperature 01 = " + temperature + " degress " + unit + ".");
    }
}