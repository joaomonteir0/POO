package viagem;

public abstract class Alojamento {
    String codigo, nome, local;
    double preco, avaliacao;
    boolean disponibilidade;

    public Alojamento(String codigo2, String nome2, String local2, double preco2, double avaliacao2, boolean disponibilidade2) {
        this.setCodigo(codigo2);
        this.setNome(nome2);
        this.setLocal(local2);
        this.setPreco(preco2);
        this.setAvaliacao(avaliacao2);
        this.setDisponibilidade(disponibilidade2);
            
	}

	public String getCodigo(){
        return this.codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return  this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getLocal(){
        return this.local;
    }

    public void setLocal(String local){
        this.local = local;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public boolean getDisponibilidade(){
        return this.disponibilidade;
    }

    public void setDisponibilidade(boolean disp){
        this.disponibilidade = disp;
    }

    public double getAvaliacao(){
        return this.avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void checkIn() {
        this.setDisponibilidade(false);
    }

    public void checkOut() {
        this.setDisponibilidade(true);
    }

}
