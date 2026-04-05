import java.util.Scanner;

public class j001 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int height = s.nextInt();
        int weight = s.nextInt();

        double bmi = weight / (height*0.01*height*0.01);

        System.out.printf("%.1f\n", bmi);
    }
}
