package poo;
public class Date {
    private static int month;
    private static int year;
    private int days;

    public Date(int mes, int ano){
        month = mes;
        year = ano;
        days = monthDays();
    }

    public Date(int dias,  int mes, int ano){
        days = dias;
        month = mes;
        year = ano;
    }

    public static int monthDays(){
        int d = 0;
        switch(month){
            case 1: case 3: case 5: case 6: case 8: case 10: case 12:
                d = 31;
                break;
            case 4: case 7: case 9: case 11:
                d = 30;
                break;
            case 2:
                if(leapYear()){
                    d = 29;
                }else{
                    d = 28;
            }
        }
        return d;
    }

    public void set(int dias, int mes, int ano){
        days = dias;
        month = mes;
        year = ano;
    }

    public int getDays(){
        return days;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public static boolean leapYear(){
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            return true;
        }else{
            return false;
        }
    }

    public static boolean checkMonth(){
        if(month>0 && month <= 12){
            return true;
        }else{
            return false;
        }
    }

    public static boolean valid(){
        if(leapYear() && checkMonth()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return month+"/"+year+" - "+days;
    }
}
