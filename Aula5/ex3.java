import java.util.Scanner;
import poo.*;

public class ex3{

    public static final Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            int op = -1;
            System.out.println("\n\n--- > OPCOES < --- ");
            System.out.println("1 - testar circulo ");
            System.out.println("2 - testar retangulo");
            System.out.println("3 - testar triangulo");
            System.out.println("0 - exit");
            System.out.printf("Opcao ~> ");
            op = sc.nextInt();
            switch(op){
                case 1:
                    teste_circle();
                    break;
                case 2:
                    teste_retangle();
                    break;
                case 3:
                    teste_retangle();
                    break;
                case 0:
                    System.exit(0);
                    sc.close();
                    break;
            }
        }
    }

    public static void teste_retangle(){
        Retangulo retangle = new Retangulo(1, -1);
        Retangulo retangle2 = new Retangulo(3, 3);
        retangle.setC(-2);
        System.out.println("\nTesting toString(): ");
        System.out.println(retangle+"\n");
        retangle.getInfos();
        System.out.printf("São iguais? %b ",retangle.equals(retangle2));
    }

    public static void teste_circle(){
        Circulo circle = new Circulo(-1);
        Circulo circle2 = new Circulo(2);
        System.out.println("\nTesting toString(): " + circle);
        System.out.printf(circle.getInfos());
        System.out.printf("São iguais? %b ",circle.equals(circle2));
    }

    public static void teste_triangle(){
        Triangulo triangle = new Triangulo(1, 1, -1);
        Triangulo triangle2 = new Triangulo(1, 1, 1);
        System.out.println(triangle.equals(triangle2));
        System.out.printf(triangle.toString() + triangle.getInfos());
    }
}