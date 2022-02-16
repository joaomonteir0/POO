package Aula2;

import java.util.Scanner;
import java.lang.Math;
// Pedir:
// Montante investido e taxa de juro mensal
// Indicar o valor total ao fim de 3 meses
// (Por exemplo, para um investimento de 5000 euros e uma taxa de 1% o 
// montante ao fim de 3 meses será de 5151.505 euros

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Montante Invesido (valor Real)~>");
        double m = sc.nextDouble();
        System.out.print("Taxa (em %)~>");
        double taxa = sc.nextDouble();
        System.out.print("Numero de meses (inteiro): ");
        int n = sc.nextInt();
        // metodo 1:
        double c = m * Math.pow((1 + taxa / 100), n);
        // metodo 2:
        /*
         * double val = 1;
         * for (int i = 0; i < n; i++) {
         * val = (1 + taxa / 100) * val;
         * }
         * double c = m * val;
         */
        System.out.println("Valor: " + c);
        sc.close();
    }
}
