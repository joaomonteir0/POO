import java.util.Scanner;

public class ex3 {

    public static boolean check_primo(int n){
        if( n <= 1){
            return false;
        }
        else if(n == 2){
            return true;
        }
        else if(n%2 == 0){
            return false;
        }

        for(int i = 3; i <= Math.sqrt(n); i+=2){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(n<=0){
            System.out.printf("Numero (int) para verificar se é primo: ");
            n = sc.nextInt();
        }
        if(check_primo(n)){
            System.out.printf("%d is prime number", n);
        }else{
            System.out.printf("%d isn't prime number", n);
        }
        sc.close();
    }

}
