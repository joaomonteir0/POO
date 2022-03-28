import java.util.Scanner;

public class exTP3 {

    public static final Scanner sc = new Scanner(System.in);

    public static void printString(String str){
        System.out.printf("Aviso!!: %s", str);
    }
    public static void main(String[] args) {
        System.out.printf("String ~> ");
        String str = sc.nextLine();
        printString(str);
        sc.close();
    }
}
