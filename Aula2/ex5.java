
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Velocidade da primeira metade (m/s) ~> ");
        double v1 = sc.nextDouble();
        System.out.print("Distancia da primeira metade (metros) ~> ");
        double d1 = sc.nextDouble();
        System.out.print("Velocidade da segunda metade (m/s) ~> ");
        double v2 = sc.nextDouble();
        System.out.print("Distancia da segunda metade (metros) ~> ");
        double d2 = sc.nextDouble();
        double t1 = d1 / v1;
        double t2 = d2 / v2;
        double vm = (d1+d2)/(t1+t2);
        System.out.println("Velocidade média: " + vm + " m/s");
        sc.close();
    }
}
