import java.util.Scanner;

public class j004 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        double x1 = s.nextDouble();
        double y1 = s.nextDouble();

        double x2 = s.nextDouble();
        double y2 = s.nextDouble();

        double distance = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));

        System.out.printf("%.1f\n", distance);
    }
}
