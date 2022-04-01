import java.util.Scanner;

public class ex4 {

    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] data = new int[3];
        System.out.print("Mês ~> ");
        data[0] = sc.nextInt();
        System.out.print("Ano ~> ");
        data[1] = sc.nextInt();
        System.out.print("Dia da semana em que começa o mês [1,7] ~> ");
        data[2] = sc.nextInt();

        int d = dias(data[0], data[1]);
        System.out.println(d);
        resultados(d, data[0], data[1], data[2]);
        sc.close();
    }

    public static int dias(int mes, int ano){
        int d = 0;
        switch(mes){
            case 1: case 3: case 5: case 6: case 8: case 10: case 12:
                d = 31;
                break;
            case 4: case 7: case 9: case 11:
                d = 30;
                break;
            case 2:
                if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
                    d = 29;
                }else{
                    d = 28;
            }
        }
        return d;
    }

    public static void resultados(int d, int m, int ano, int comeca){
        String[] meses = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String date = String.format("%s %s", meses[m-1], ano);
        for (int i = 0; i < (20 - date.length())/2; i++){
            System.out.print(" ");
        }
        System.out.println(date);
        System.out.println("Su Mo Tu We Th Fr Sa");
        int daycount = 1, controlo = 0;
        for (int s = 0; s < 6; s++) {
            String calendario[][] = new String[1][7];
            for (int ds = 0; ds < 7; ds++){
                if (controlo == 0) {
                    controlo++;
                    ds = comeca - 2;
                } else {
                    if (daycount > d) {
                        break;
                    }
                    calendario[0][ds] = Integer.toString(daycount);
                    daycount++;
                }
            }
            for (int a = 0; a < 7; a++){
                if (calendario[0][a] == null){
                    calendario[0][a] = "";
                }
            } 
            System.out.println(String.format("%2s %2s %2s %2s %2s %2s %2s", calendario[0][0], calendario[0][1], calendario[0][2], calendario[0][3], calendario[0][4], calendario[0][5], calendario[0][6]));
        }

    }
}

