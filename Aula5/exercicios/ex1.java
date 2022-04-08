package exercicios;
import poo.Date;
import java.util.Scanner;


public class ex1 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[]args){

        int op, dias, mes, ano, qtd;
        Date hello = new Date(11, 2000);
        while(true){
            System.out.println("Date operations:\n1 - create new date\n2 - show current date\n3 - increment date\n4 - decrement date\n0 - exit \n");
            op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.printf("\nDias ~> ");
                    dias = sc.nextInt();
                    System.out.printf("Mes ~> ");
                    mes = sc.nextInt();
                    System.out.printf("Ano ~> ");
                    ano = sc.nextInt();
                    hello.set(dias, mes, ano);
                    System.out.println(hello+"\n");
                    break;
                case 2:
                    System.out.println(hello);
                    break;
                case 3:
                    System.out.printf("\nIncremento ~> ");
                    qtd = sc.nextInt();
                    hello.increment(hello.getDays(), hello.getMonth(), hello.getYear(), qtd);
                    System.out.println(hello+"\n");
                    break;
                case 4:
                    hello.decrement(hello.getDays(), hello.getMonth(), hello.getYear());
                    System.out.println(hello+"\n");
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }  
    }   
}