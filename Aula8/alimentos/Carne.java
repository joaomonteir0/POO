package alimentos;

public class Carne extends Alimento{

    private VariedadeCarne variedade;

    public Carne(double proteinas, double calorias, double peso, VariedadeCarne variedade) {
        super(proteinas, calorias, peso);
        this.variedade = variedade;
    }

    public VariedadeCarne getVariedade(){
        return this.variedade;
    }
    

    @Override
    public boolean isVegetarian() {
        return false;
    }

    @Override
    public String toString() {
        return "Variedade: "+this.getVariedade()+", proteinas: "+this.getProteinas()+", calorias: "+this.getCalorias()+", peso: "+this.getPeso()+"g"+", vegetariano: "+isVegetarian();
    }
}
