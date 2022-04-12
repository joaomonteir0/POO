package poo;

public class LivroEletronico extends Publicacao {
    private String url;
    private int prazo;
    boolean status = true;

    public LivroEletronico(int id, String titulo){
        super(titulo, id);
        this.url = generateURL();
        this.prazo = 10;
    }

    public LivroEletronico(String titulo, String autor){
        super(titulo, autor);
        this.url = generateURL();
        this.prazo = 10;
    }

    public LivroEletronico(String titulo){
        super(titulo);
        this.url = generateURL();
        this.prazo = 10;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public String generateURL(){
        int teste =  (int)((Math.random() * 9999) + 1000);
        return "https://livrariaZezoca.com/ebook=" + String.valueOf(teste);
    }

    public int getPrazo(){
        return this.prazo;
    }

    public String getUrl(){
        return this.url;
    }

    @Override
    public String toString(){
        return "Livro "+getId()+"; Título: "+getTitulo()+"; URL: "+getUrl()+"; Autor: "+getAutor();
    }

}
