import java.util.Scanner;

public class ex5 {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double inv = -1;
        double tax = -1;
        while(inv<0 || inv > 1000){
            System.out.printf("Investimento [0,1000]: ");
            inv = sc.nextDouble();
        }
        while(tax < 0 || tax > 5){
            System.out.print("Taxa de juro [0,5]%:" );
            tax = sc.nextDouble();
        }
        System.out.printf("Montante inicial: %.3f\n",inv);
        for(int i = 1; i<=12; i++){
            inv = inv+inv*tax/100;
            System.out.printf("Mês %d : %.3f\n",i, inv);
        }

    }
}