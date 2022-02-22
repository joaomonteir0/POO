
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tempo em segundos ~> ");
        int tempo = sc.nextInt();
        int horas = tempo / 3600;
        int minutos = (tempo % 3600) / 60;
        int segundos = tempo % 60;

        System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);

        sc.close();
    }
}
