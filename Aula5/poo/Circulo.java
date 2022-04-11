package poo;
import java.util.Scanner;

public class Circulo {

    public static final Scanner sc = new Scanner(System.in);

    private double raio;

    public Circulo(double raio){
        if(raio < 0){
            this.raio = askRaio();
        }else{
            this.raio =  raio;
        }
    }

    public double askRaio(){
        double newRaio = -1;
        do{
            System.out.printf("Raio tem de ser positivo, raio ~> ");
            newRaio = sc.nextDouble();
        }while(newRaio < 0);
        return newRaio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }

    public double getArea(){
        return  Math.PI * Math.pow(raio, 2);
    }

    public double getPerimetro(){
        return 2*Math.PI*raio;
    }

    public String getInfos(){
        return "Raio = "+raio+"\nArea = "+getArea()+"\nPerimetro = "+getPerimetro()+"\n";
    }

    public boolean equals(Circulo pObject){
        if(raio == pObject.getRaio()){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return ""+raio;
    }
}
