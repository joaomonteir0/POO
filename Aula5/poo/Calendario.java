package poo;

public class Calendario {
    private int year, day;

    public Calendario(int year, int day) {
        this.year = year;
        this.day = day;
        assert isValid(year, day);

    }
    
    public int getYear() {
        return this.year;
    }

    public boolean isValid(int year, int day) {
        if (year < 1) {
            return false;
        }
        if (day < 1 || day > 7) {
            return false;
        }
        return true;
    }

    public int getDayofWeek() {
        return this.day;
    }

    public int firstWeekdayOfMonth(int month) {
        int firstWeekday = this.day;
        for (int i = 1; i < month; i++) {
            firstWeekday += Date.monthDias_2(i);
        }
        return firstWeekday % 7 == 0 ? 7 : firstWeekday % 7;

    }

    public String monthName(int month) {

        switch (month) {

            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid";

        }
    }

    public void printMonth(int month) {
        int firstWeekday = this.firstWeekdayOfMonth(month);
        int monthDays = Date.monthDias_2(month);
        String monthName = monthName(month);

        int monthNameLength = monthName.length();
        int yearlength = String.valueOf(year).length();
        int padding = (20 - monthNameLength - yearlength) / 2;
        String paddingString = "";

        for (int i = 0; i < padding; i++) {
            paddingString += " ";
        }

        System.out.println(paddingString + monthName + " " + year + paddingString);
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 1; i < firstWeekday; i++) {
            System.out.print("   ");
        }
        for (int i = 1; i <= monthDays; i++) {
            System.out.printf("%3d", i);
            if ((i + firstWeekday - 1) % 7 == 0 || i == monthDays) {
                System.out.println();
            }
        }
    }

    public String toString() {
        for (int i = 1; i <= 12; i++) {
            printMonth(i);
            if (i != 12) {
                System.out.println();
            }
        }
        return "Calendar of " + this.year;

    }
}