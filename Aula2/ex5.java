package Aula2;

import java.util.Scanner;
// velocidade média de transporte de A para B
// duas etapas de comprimento igual
// pedir o v1 - velocidade média da primeira metade
// pedir v2 - velocidade média da segunda metade
// calcular e imprimir a velocidade média final

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distancia da primeira metade (metros) ~> ");
        double d1 = sc.nextDouble();
        System.out.print("Tempo da primeira metade (segundos) ~> ");
        double t1 = sc.nextDouble();
        System.out.print("Distancia da segunda metade (metros) ~> ");
        double d2 = sc.nextDouble();
        System.out.print("Tempo da segunda metade (segundos) ~> ");
        double t2 = sc.nextDouble();

        double vm = (d1+d2)/(t1+t2);
        System.out.println("Velocidade média: " + vm + " m/s");
        sc.close();
    }
}
