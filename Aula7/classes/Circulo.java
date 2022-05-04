package classes;

import java.util.Scanner;

public class Circulo extends Forma {

    public static final Scanner sc = new Scanner(System.in);

    private double raio;

    public Circulo(double raio, String cor) {
        if (raio < 0) {
            this.raio = askRaio();
        } else {
            this.raio = raio;
        }
        this.setArea();
        this.setPerimetro();
        this.cor = cor;
    }

    public double askRaio() {
        double newRaio = -1;
        do {
            System.out.printf("Raio tem de ser positivo, raio ~> ");
            newRaio = sc.nextDouble();
        } while (newRaio < 0);
        return newRaio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setArea() {
        this.area = Math.PI * (Math.pow(this.getRaio(), 2));
    }

    public void setPerimetro(){
        this.perimetro = 2*Math.PI*this.getRaio();
    }

    public boolean isValid() {
        return this.getRaio() > 0;
    }

    @Override
    public String toString() {
        return "raio: " + raio + ", area: " + getArea() + ", perimetro: " + getPerimetro() + ", cor: " + getCor();
    }

}
