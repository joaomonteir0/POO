package alimentos;

public class Peixe extends Alimento {

    private TipoPeixe tipo;

    public Peixe(double proteinas, double calorias, double peso, TipoPeixe tipo) {
        super(proteinas, calorias, peso);
        this.tipo = tipo;
    }

    public TipoPeixe getTipo(){
        return this.tipo;
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }

    @Override
    public String toString(){
        return "Tipo: "+this.getTipo()+", proteinas: "+this.getProteinas()+", calorias: "+this.getCalorias()+", peso: "+this.getPeso()+"g"+", vegetariano: "+isVegetarian();

    }
    
}
