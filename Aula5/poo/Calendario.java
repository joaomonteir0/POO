package poo;

public class Calendario {
    int ano;
    int dia;

    public Calendario(int ano, int dia){
        this.ano = ano;
        this.dia = dia;
    }

    public int year(){
        return ano;
    }

    public int firstWeekdayOfYear(){
        return dia;
    }

    public void firstWeekdayOfMonth(int month){
        resultados(month);
    }

    public int dias(int mes, int ano){
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

    public void resultados(int month){
        String[] meses = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String date = String.format("%s %s", meses[month-1], ano);
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
                    ds = dia - 2;
                } else {
                    if (daycount > 31) {
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
            }
            String dias = " ";
            if(dia == 1){
                int [] diasToPrint = new int [31];
                int len = 0;
                for(int k = 1; k< dias(1,ano); k++){
                    diasToPrint[k] = k;
                    len++;
                }
                dias+=String.format("%2s %2s %2s %2s %2s %2s\n", 1, 2, 3, 4, 5,6);
                System.out.println(dias);
        }
    }
}
