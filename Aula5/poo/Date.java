package poo;
public class Date {
    private static int month;
    private static int year;
    private static int days;

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

    public void incrementYear(){
        year = year+1;
    }
    public void incrementDays(int qtd){
        days = days+qtd;
    }
    public void decrementDays(){
        days = days--;
    }

    public void increment(int days, int month, int year, int qtd){
        int excesso = days+qtd - days -1;
        if(excesso < 0){
            excesso = 0;
        }
        incrementDays(qtd);
        switch(month){
            case 1: case 3: case 5: case 6: case 8: case 10:
                if( days == 31){
                    month++;
                    days = 1+excesso;
                }
                break;
            case 12:
                if(days >= 31){
                    month = 1;
                    days = 1+excesso;
                    incrementYear();
                }
                break;
            case 4: case 7: case 9: case 11:
                if(days == 30){
                    month++;
                    days = 1+excesso;
                }
                break;
            case 2:
                if(leapYear() && days >= 29){
                    month++;
                    days = 1+excesso;
                }else if(days >= 28){
                    month++;
                    days = 1+excesso;
            }
        }
        set(days, month, year);
    }

    public void decrement(int days, int month, int year){
        decrementDays();
        switch(month){
            case 3: case 5: case 6: case 8: case 10: case 12:
                if( days == 1){
                    month--;
                    days = 30;
                }
                break;
            case 1:
                if(days == 1){
                    month = 12;
                    days = 31;
                    incrementYear();
                }
                break;
            case 4: case 7: case 9: case 11:
                if(days == 1){
                    month--;
                    days = 31;
                }
                break;
            case 2:
                if(days == 1){
                    month--;
                    days = 31;
                }
        }
        set(days, month, year);
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
        return year+"-"+month+"-"+days;
    }
}
