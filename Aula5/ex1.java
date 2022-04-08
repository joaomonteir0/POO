import poo.Date;

public class ex1 {
    public static void main(String[]args){
        System.out.println("mes / ano - dias");
        Date hello = new Date(11, 2000);
        System.out.println(hello);
        System.out.println("O mês é válido? "+Date.checkMonth());
        System.out.println("O ano é bissexto? "+Date.leapYear());
        System.out.println("A data é válida? "+Date.valid());

        hello.set(10,10,100);
        System.out.println(hello);
        System.out.println("O mês é válido? "+Date.checkMonth());
        System.out.println("O ano é bissexto? "+Date.leapYear());
        System.out.println("A data é válida? "+Date.valid());
    }
}