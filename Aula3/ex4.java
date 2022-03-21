import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ctr = 0, n, max = 0, min = 0, sum = 0;
        int count = 1;

        while (true) {
            System.out.print("Número Real? ");
            n = sc.nextDouble();
            sum=sum+n;

            if (ctr == 0){
                ctr = n;
                max = n;
                min = n;
            } else {
                if (ctr == n) {
                    break;
                }
            }
            double newmax = Math.max(n, max);
            double newmin = Math.min(n, min);
            max = newmax;
            min = newmin;
            count++;
            
        }
        double average = sum/count;
        System.out.println(count);
        System.out.println(min);
        System.out.println(max);
        System.out.println(average);


        sc.close();

    }
}