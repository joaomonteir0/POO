import java.util.Scanner;
import java.lang.Math;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cateto A ~> ");
        double a = sc.nextDouble();
        System.out.print("Cateto B ~> ");
        double b = sc.nextDouble();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("Hipotenusa C ~> %.3f", c);
        System.out.printf("\nAngulo AC ~> %.3f degrees", (Math.asin(b / c) * 180) / 3.1415);

        sc.close();
    }
}
