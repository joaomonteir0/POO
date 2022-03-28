import java.util.Scanner;
// Escreva uma função estática para devolver o maior de dois números reais

public class exTP3x3 {

    public static final Scanner sc = new Scanner(System.in);

    public static Double comparar(Double number1, Double number2){
        if(number1 < number2){
            return number2;
        }else {
            return number1;
        }
    }
    public static void main(String[] args) {
        System.out.printf("1st number: ");
        Double number1 = sc.nextDouble();
        System.out.printf("2nd number: ");
        Double number2 = sc.nextDouble();
        Double maior = comparar(number1, number2);
        System.out.printf("%.3f é o maior numero inserido", maior);

    }
    
}
