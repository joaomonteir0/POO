package classes;

public class Pessoa {
    private String nome;
    private int cc;
    private Date dataNasc;

    public Pessoa(String nome, int cc, Date dataNasc){
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    public String getName(){
        return this.nome;
    }

    public int getCC(){
        return cc;
    }

    @Override
    public String toString(){
        return "Nome: "+this.getName()+", CC: "+this.getCC()+", Data Nasc: "+dataNasc.toString();
    }
}