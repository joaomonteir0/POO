package classes;

public abstract class Forma {
    protected double area, perimetro;
    protected String cor;

    protected abstract void setPerimetro();

    protected abstract void setArea();

    public abstract boolean isValid();

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public boolean equals(Forma forma) {
        return this.toString().equals(forma.toString());
    }

}
