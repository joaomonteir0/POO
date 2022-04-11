package poo;

public class Livro {
    private int id; // starts in 100
    private String titulo;
    private String tipoEmprestimo; // CONDICIONAL ou NORMAL)
    private static int count = 0;

    public Livro(int id, String titulo, String tipoEmprestimo){
        this.titulo = titulo;
        this.tipoEmprestimo = tipoEmprestimo;
        this.id = id;
        count++;
    }


    public Livro(String titulo, String tipoEmprestimo){
        this.titulo = titulo;
        this.tipoEmprestimo = tipoEmprestimo;
        this.id = 100 + count;
        count++;
    }

    public Livro(String titulo){
        this.titulo = titulo;
        this.id = 100 + count;
        this.tipoEmprestimo = "NORMAL";
        count++;
    }

    public void setTipoEmprestimo(String tipo){
        this.tipoEmprestimo = tipo;
    }

    public int getId(){
        return this.id;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getTipoEmprestimo(){
        return this.tipoEmprestimo;
    }

    @Override
    public String toString(){
        return "Livro "+getId()+"; Título: "+getTitulo()+"; "+getTipoEmprestimo();
    }

}
