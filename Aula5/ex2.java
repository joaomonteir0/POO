import java.util.Scanner;
import poo.Calendario;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendario calendar = new Calendario(2000, 1);
        int op;

        do {
            System.out.printf("Current year %d\n", calendar.getYear());
            System.out.println("1 - create New Calendar");
            System.out.println("2 - print Calendar Month");
            System.out.println("3 - print Calendar");
            System.out.println("0 - exit");
            System.out.print("Operation ~> ");
            

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("year ~> ");
                    int year = sc.nextInt();
                    System.out.print("starting day [1,7] ~> ");
                    int ds = sc.nextInt();
                    calendar = new Calendario(year, ds);
                    break;
                case 2:
                    System.out.print("month ~> ");
                    int month = sc.nextInt();
                    calendar.printMonth(month);
                    break;
                case 3:
                    calendar.toString();
                    break;
                case 0:
                    System.exit(1);
                    break;
            }

        } while (op != 0);

        sc.close();
    }
}