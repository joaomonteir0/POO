package viagem;

public class Apartamento extends Alojamento{
    private int numero_de_quartos;


    public Apartamento(String codigo, String nome, String local, double preco, double avaliacao, boolean disponibilidade, int numero_de_quartos){
        super(codigo, nome, local, preco, avaliacao, disponibilidade);
        this.setNumero_de_quartos(numero_de_quartos);
    }

    public int getNumero_de_quartos() {
        return numero_de_quartos;
    }

    public void setNumero_de_quartos(int numero_de_quartos) {
        this.numero_de_quartos = numero_de_quartos;
    }

    @Override
    public String toString() {
        return "\nApartamento:\n" + "codigo: " + this.getCodigo() + ",\nnome: " + this.getNome() + ",\nlocal: " + this.getLocal() + ",\npreco: " + this.getPreco() + ",\navaliacao: " + this.getAvaliacao() + ",\ndisponibilidade: " + this.getDisponibilidade() + ",\nnumero_de_quartos: " + this.numero_de_quartos;
    }
}
