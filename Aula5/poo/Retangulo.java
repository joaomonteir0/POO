package poo;
import java.util.Scanner;

public class Retangulo {

    public static final Scanner sc = new Scanner(System.in);

    private double c, h;

    public Retangulo(double c, double h){
        if(c < 0 || h < 0){
            do{
                System.out.println("Valores positivos!");
                System.out.printf("Comprimento ~> ");
                c = sc.nextDouble();
                System.out.printf("Altura ~> ");
                h = sc.nextDouble();
            }while(c < 0 || h < 0);
        }
        this.c = c;
        this.h = h;
    }

    public double getC(){
        return this.c;
    }

    public double getH(){
        return this.h;
    }

    public void setC(double c){
        while(c<0){
            System.out.printf("C tem de ser positivo ~> ");
            c = sc.nextDouble();
        }
        this.c = c;
    }
    public void setH(double h){
        while(h<0){
            System.out.printf("C tem de ser positivo ~> ");
            h = sc.nextDouble();
        }
        this.h = h;
    }

    public double getArea(){
        return this.h*this.c;
    }

    public double getPerimetro(){
        return this.h*2 + this.c*2;
    }

    public void getInfos(){
        System.out.println("Comprimento = "+c+"\nAltura = "+h+"\nArea = "+getArea()+"\nPerimetro = "+getPerimetro());
    }

    public boolean equals(Retangulo pObject){
        if(pObject.getC() == this.c && pObject.getH() == this.h){
            return true;
        }
        return false;
    }

    @Override
    public String toString()  {
        return "Comprimento = "+c+"\nAltura = "+h;
    }
}
