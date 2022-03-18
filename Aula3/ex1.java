import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notaP = -1, notaT = -1, notaFinal = 0;


        while(notaP < 0 || notaP > 20){
            System.out.println("Nota prática [0,20]: ");
            notaP = sc.nextDouble();
            if(notaP < 0 || notaP > 20){
                System.out.println("O valor tem de ser entre 0 e 20");
            }
        }
        while(notaT < 0 || notaT > 20){
            System.out.println("Nota teórica [0,20]: ");
            notaT = sc.nextDouble();
            if(notaT < 0 || notaT > 20){
                System.out.println("O valor tem de ser entre 0 e 20");
            }
        }
        sc.close();

        if(notaP < 7 || notaP < 7){
            System.out.println("Reprovado por nota mínima!");
            System.exit(1);
        }else{
            notaFinal = 0.4*notaT + 0.6*notaP;
        }

        System.out.printf("Aprovado com %.2f!", notaFinal);
    }
}   
