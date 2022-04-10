import java.util.Scanner;
public class teste {

    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        while(true){
            System.out.println("Date operations:\n1 - create new date\n2 - show current date\n3 - increment date\n4 - decrement date\n0 - exit \n");
            op = sc.nextInt();
        }   
    }
}
