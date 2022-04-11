package poo;

public class Utilizador {
    private String nome;
    private int nMec;
    private String curso;

    public Utilizador(String nome, int nMec, String curso){
        this.nome = nome;
        this.nMec = nMec;
        this.curso = curso;
    }

    public void setnMec(int nmec){
        this.nMec = nmec;
    }

    public int getNMec(){
        return this.nMec;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCurso(){
        return this.curso;
    }

    @Override
    public String toString() {
        return "Aluno: "+getNMec()+"; "+getNome()+"; "+getCurso();
    }
}
