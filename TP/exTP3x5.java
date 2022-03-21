import java.util.Scanner;
// Escreva uma função estática para ler do teclado um número real entre 0 e 10
public class exTP3x5 {
    public static final Scanner sc = new Scanner(System.in);

    private static Double readDouble(){
        Double x = -1.0;
        while(x<0 || x>10){
            System.out.printf("Number between [0,10]: ");
            x = sc.nextDouble();
        }
        return x;
    }

    public static void main(String[] args) {
        Double number = readDouble();
        System.out.printf("%.2f", number);
    }
}
