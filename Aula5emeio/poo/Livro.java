package poo;

public class Livro extends Publicacao{
    private String tipoEmprestimo; // CONDICIONAL ou NORMAL)
    private int nCopias;

    public Livro(int id, String titulo, String tipoEmprestimo, int nCopias){
        super(titulo, id);
        this.tipoEmprestimo = tipoEmprestimo;
        this.nCopias = nCopias;
    }

    public Livro(int id, String titulo, String tipoEmprestimo){
        super(titulo, id);
        this.tipoEmprestimo = tipoEmprestimo;
        if(this.tipoEmprestimo == "NORMAL"){
            this.nCopias = 1;
        }else{
            this.nCopias = 0;
        }
    }


    public Livro(String titulo, String tipoEmprestimo){
        super(titulo);
        this.tipoEmprestimo = tipoEmprestimo;
        if(this.tipoEmprestimo == "NORMAL"){
            this.nCopias = 1;
        }else{
            this.nCopias = 0;
        }
    }

    public Livro(String titulo){
        super(titulo);
        this.tipoEmprestimo = "NORMAL";
        this.nCopias = 1;
    }

    public void setTipoEmprestimo(String tipo){
        this.tipoEmprestimo = tipo;
    }

    public String getTipoEmprestimo(){
        return this.tipoEmprestimo;
    }

    public int getNCopias(){
        return this.nCopias;
    }

    @Override
    public String toString(){
        return "Livro "+getId()+"; Título: "+getTitulo()+"; Empréstimo: "+getTipoEmprestimo()+"; Copias: "+getNCopias();
    }

}
