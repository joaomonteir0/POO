import java.util.Random;
import java.util.Scanner;

public class ex7 {
    public static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Random ran = new Random();
        String action = "Sim";
        while(action.compareTo("Sim") == 0 || action.compareTo("S") == 0){
            System.out.println("Advinhar o número: ");
            int tentativas = 0, number = ran.nextInt(100)+1, tentativa = -1;
            do{
                System.out.printf("Numero ~> ");
                tentativa = sc.nextInt();
                tentativas++;
                if(number<tentativa){
                    System.out.println("Baixo");
                } else if(number> tentativa){
                    System.out.println("Alto");
                }else{
                    System.out.println("Acertou!");
                }
            }while(tentativa!=number);
            System.out.printf("Usou %d tentativas\n", tentativas);
            System.out.printf("Se quer continuar digite S ou Sim ~> ");
            action = sc.next();
        }
    }
}
