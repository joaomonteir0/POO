package viagem;

public class Carro {
    private char classe;
    private String tipo, codigo;
    private boolean disponibilidade;


    public Carro(String codigo, char classe, String tipo, boolean disponibilidade) {
        this.setCodigo(codigo);
        this.setClasse(classe);
        this.setTipo(tipo);
        this.setDisponibilidade(disponibilidade);
    }

    public char getClasse() {
        return classe;
    }

    public void setClasse(char classe) {
        if (classe != 'A' && classe != 'B' && classe != 'C' && classe != 'D' && classe != 'E' && classe != 'F') throw new IllegalArgumentException("classe invalida");
        this.classe = classe;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if ((!tipo.equals("gasolina") && !tipo.equals("disel") && !tipo.equals("hibrido") && !tipo.equals("eletrico")) || (tipo == null || tipo.equals(""))) throw new IllegalArgumentException("Invalid Value");
        this.tipo = tipo;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String toString() {
        return "\nCarro:\n" +  "codigo: " + this.getCodigo() + ",\nclasse: " + this.getClasse() + ",\ntipo: " + this.getTipo() + ",\ndisponibilidade: " + this.isDisponivel() + "\n";
    }

    public void levantar() {
        this.setDisponibilidade(false);
    }

    public void entregar() {
        this.setDisponibilidade(true);
    }
}
