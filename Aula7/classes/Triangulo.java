package classes;

public class Triangulo extends Forma {
    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3, String cor) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.cor = cor;
        this.setArea();
        this.setPerimetro();
    }

    public void setPerimetro() {
        this.perimetro = this.lado1 + this.lado2 + this.lado3;
    }

    public void setArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        this.area = Math.sqrt(s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3));
    }

    public boolean isValid() {
        if (this.lado1 <= 0 || this.lado2 <= 0 || this.lado3 <= 0) {
            return false;
        }
        if (this.lado1 + this.lado2 > this.lado3 && this.lado1 + this.lado3 > this.lado2
                && this.lado2 + this.lado3 > this.lado1) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "lado1: " + this.lado1 + ", lado2: " + this.lado2 + ", lado3: " + this.lado3 + ", area: "
                + this.getArea() + ", perimetro: " + this.getPerimetro() + ", cor: " + this.getCor();
    }
}
