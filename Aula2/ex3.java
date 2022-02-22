
import java.util.Scanner;

// ler a quantidade de água M (em quilogramas)
// ler a temperatura inicial e final da água (em Célsius)
// A fórmula para calcular a energia Q (em Joules) é dada por:
// Q = M * (finalTemperature - initialTemperature) * 4184.
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de água (em quilogramas) ~> ");
        double M = sc.nextDouble();
        System.out.print("Temperatura inicial (em Célsius) ~> ");
        double initialTemperature = sc.nextDouble();
        System.out.print("Temperatura final (em Célsius) ~> ");
        double finalTemperature = sc.nextDouble();
        if (finalTemperature < initialTemperature) {
            while (finalTemperature < initialTemperature) {
                System.out.print(
                        "#ERRO: Temperatura final menor que a inicial \nTemperatura final (em Célsius) ~> ");
                finalTemperature = sc.nextDouble();
            }
        }

        double Q = M * (finalTemperature - initialTemperature) * 4184;

        System.out.println("Energia necessária (Q): " + Q + " Joules.");
        sc.close();
    }
}
