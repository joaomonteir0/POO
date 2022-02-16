package Aula2;

import java.util.Scanner;
// Lê em valor real em célsius e passa para Fahrenheit
// A fórmula de conversão de graus Célsius (C) para graus Fahrenheit (F) é a seguinte: 
// F = 1.8 ∗ C + 32

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura em Célsius: ");
        double C = sc.nextDouble();
        double f = 1.8 * C + 32;
        System.out.println("A temperatura em Fahrenheit é: " + f);
        sc.close();
    }
}
