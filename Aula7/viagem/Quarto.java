package viagem;

public class Quarto extends Alojamento{

    private String tipo;

    public Quarto(String codigo, String nome, String local, double preco, double avaliacao, boolean disponibilidade, String tipo){
        super(codigo, nome, local, preco, avaliacao, disponibilidade);
        this.setTipo(tipo);
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        if ((!tipo.equals("single") && !tipo.equals("double") && !tipo.equals("triple") && !tipo.equals("twin"))||(tipo == null || tipo.equals(""))) throw new IllegalArgumentException("Invalid Value");
        this.tipo = tipo;
    }

    public String toString() {
        return "\nQuarto de Hotel:\n" + "codigo: " + this.getCodigo() + ",\nnome: " + this.getNome() + ",\nlocal: " + this.getLocal() + ",\npreco: " + this.getPreco() + ",\navaliacao: " + this.getAvaliacao() + ",\ndisponibilidade: " + this.getDisponibilidade() + ",\ntipo: " + this.getTipo()+"\n";
    }
}
