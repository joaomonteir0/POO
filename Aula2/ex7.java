
import java.util.Scanner;
import java.lang.Math;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ponto 1\nX ~> ");
        double x1 = sc.nextDouble();
        System.out.print("Y ~> ");
        double y1 = sc.nextDouble();
        System.out.print("Ponto 2\nX ~> ");
        double x2 = sc.nextDouble();
        System.out.print("Y ~> ");
        double y2 = sc.nextDouble();
        System.out.printf("Ponto 1 : (%.2f, %.2f) \nPonto 2 : (%.2f, %.2f)", x1, y1, x2, y2);

        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("\nDistância entre p1 e p2 é: %.2f", dist);
        sc.close();
    }
}
