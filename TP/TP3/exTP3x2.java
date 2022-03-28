import java.util.Scanner;

// Escreva uma função estática para, dado um valor real x, calcular e devolver o valor de 2*x2
public class exTP3x2 {
    public static final Scanner sc = new Scanner(System.in);

    public static Double calc(Double x){
        return 2*(Math.pow(x, 2));
    }
    public static void main(String[] args) {
        Double x = sc.nextDouble();
        x = calc(x);
        System.out.println(x);
        sc.close();
        
    }
}
