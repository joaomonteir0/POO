package alimentos;

public abstract class Alimento {
    private double proteinas, calorias, peso;

    public Alimento(double proteinas, double calorias, double peso){
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public abstract boolean isVegetarian();

    public double getProteinas(){
        return this.proteinas;
    }

    public double getCalorias(){
        return this.calorias;
    }

    public double getPeso(){
        return this.peso;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + (int) getProteinas();
        hash = 31 * hash + (int) getCalorias();
        hash = 31 * hash + (int) getPeso();
        return hash;
    }

}
