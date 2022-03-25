import java.util.Scanner;

public class ex6 {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        int mes = -1, ano = -1;

        while (0 >= mes || mes > 12) {
            System.out.print("Mês? ");
            mes = sc.nextInt(); 
        }
        while (-1 >= ano) {
            System.out.print("Ano? ");
            ano = sc.nextInt(); 
        }

        switch (mes) {
            case 1: case 3: case 5: case 6: case 8: case 10: case 12: 
                System.out.println("31");
                break;
            case 4: case 7: case 9: case 11:
                System.out.println("30");
                break; 
            case 2:
                if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
                    System.out.println("29");
                }else{
                    System.out.println("28");
            }
        }

        sc.close();
    }
}
