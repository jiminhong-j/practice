import java.util.Scanner;

public class j003 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        double m2_area = s.nextDouble();

        double pyung_area = m2_area / 3.305;

        System.out.printf("%.1f\n", pyung_area);
    }
}
