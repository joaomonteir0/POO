
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quilómetros? ");
        double quilometros = sc.nextDouble();
        double milhas = quilometros / 1.609;
        System.out.print(quilometros + " km = " + milhas + " milhas");

        sc.close();
    }
}