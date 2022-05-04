package classes;

public class Retangulo extends Forma {
    private double comprimento, altura;

    public Retangulo(double comprimento, double altura, String cor) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.setArea();
        this.setPerimetro();
        this.cor = cor;
    }

    public void setArea() {
        this.area = comprimento * altura;
    }

    public void setPerimetro() {
        this.perimetro = comprimento * 2 + altura * 2;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public String getCor(){
        return this.cor;
    }

    public double getArea() {
        return this.area;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getComprimento() {
        return this.comprimento;
    }

    public boolean isValid() {
        return this.getComprimento() >= 0 && this.getAltura() >= 0;
    }
    
    @Override
    public String toString() {
        return "altura: " + this.getAltura() + ", comprimento: " + this.getComprimento() + ", area: " + this.getArea()
                + ", perimetro: " + this.getPerimetro()+", cor: "+this.getCor();
    }
}
