import java.util.Scanner;
import classes.*;

public class ex1{

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
                    teste_triangle();
                    break;
                case 0:
                    System.exit(0);
                    sc.close();
                    break;
            }
        }
    }

    public static void teste_retangle(){
        Retangulo retangle = new Retangulo(1, -1, "Preto");
        Retangulo retangle2 = new Retangulo(3, 3, "Preto");
        Retangulo retangle3 = new Retangulo(3, 3, "Preto");
        System.out.println("\nTesting toString(): ");
        System.out.println(retangle+"\n");
        System.out.printf("São iguais? %b \n",retangle.equals(retangle2));
        System.out.printf("São iguais? %b \n",retangle2.equals(retangle3));

    }

    public static void teste_circle(){
        Circulo circle = new Circulo(-1, "Verde");
        Circulo circle2 = new Circulo(2, "Verde");
        Circulo circle3 = new Circulo(2, "Verde");
        System.out.println("\nTesting toString(): " + circle);
        System.out.printf("São iguais? %b\n",circle.equals(circle2));
        System.out.printf("São iguais? %b\n",circle2.equals(circle3));
    }

    public static void teste_triangle(){
        Triangulo triangle = new Triangulo(1, 1, -1, "Azul");
        Triangulo triangle2 = new Triangulo(1, 1, 1, "Azul");
        Triangulo triangle3 = new Triangulo(1, 1, 1, "Azul");

        System.out.printf("São iguais? %b\n", triangle.equals(triangle2));
        System.out.printf("São iguais? %b\n", triangle3.equals(triangle2));

    }
}