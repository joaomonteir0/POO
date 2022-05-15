package alimentos;

public class Legume  extends Alimento{

    private String nome;

    public Legume(double proteinas, double calorias, double peso, String nome) {
        super(proteinas, calorias, peso);
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public boolean isVegetarian() {
        return true;
    }

    @Override
    public String toString() {
        return "Legume: "+this.getNome()+", proteinas: "+this.getProteinas()+", calorias: "+this.getCalorias()+", peso: "+this.getPeso()+"g"+", vegetariano: "+isVegetarian();
    }
    
}
