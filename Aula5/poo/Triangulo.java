package poo;
import java.util.Scanner;
public class Triangulo {
    public static final Scanner sc = new Scanner(System.in);

    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

        if(lado1 < 0 || lado2 < 0 || lado3 < 0) askLado();
        
    }

    public void askLado(){
        double [] lados = new double[3];
        do{
            System.out.println("Todos os lados têm de ser positivos: ");
            System.out.printf("Lado1 ~> ");
            lados[0] = sc.nextDouble();
            System.out.printf("Lado2 ~> ");
            lados[1] = sc.nextDouble();
            System.out.printf("Lado3 ~> ");
            lados[2] = sc.nextDouble();
        }while(lados[0] < 0 || lados[1] < 0 || lados[2] < 0);

        if(lados[0] + lados[1] > lados[2] && lados[0] + lados[2] > lados[1] && lados[1] + lados[2] > lados[0]){
            this.lado1 = lados[0];
            this.lado2 = lados[1];
            this.lado3 = lados[2];
        }else{
            System.out.println("Lados não satisfazem a desigualdade triangular");
            askLado();
        }
    }

    public double getLado1(){
        return lado1;
    }
    public double getLado2(){
        return lado2;
    }
    public double getLado3(){
        return lado3;
    }

    public void setLado1(double lado){
        this.lado1 = lado;
    }
    public void setLado2(double lado){
        this.lado2 = lado;
    }
    public void setLado3(double lado){
        this.lado3 = lado;
    }

    public double getArea(){
        double s = (lado1 + lado2 + lado3)/2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }

    public double getPerimetro(){
        return lado1+lado2+lado3;
    }

    public String getInfos(){
        return "Area = "+getArea()+"\nPerimetro = "+getPerimetro()+"\n";
    }

    public boolean equals(Triangulo pObject){
        if(lado1 == pObject.getLado1()){
            if(lado2 == pObject.getLado2()){
                if(lado3 == pObject.getLado3()){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "lado1 = "+lado1+", lado2 = "+lado2+", lado3 = "+lado3+"\n";
    }
}
