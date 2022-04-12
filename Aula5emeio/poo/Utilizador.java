package poo;

public class Utilizador {
    private String nome;
    private int nMec, nReq = 0;
    private String req [] = new String[3];
    private boolean ebook_status = true;
    private String curso;

    public Utilizador(String nome, int nMec, String curso){
        this.nome = nome;
        this.nMec = nMec;
        this.curso = curso;
    }

    public void setnMec(int nmec){
        this.nMec = nmec;
    }

    public boolean getebook_status(){
        return this.ebook_status;
    }

    public void setebook_status(boolean status){
        this.ebook_status = status;
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

    public void requisitar(Livro pObject){
        if(pObject.getTipoEmprestimo() == "NORMAL"){
            pObject.setTipoEmprestimo("CONDICIONAL");
            req[nReq] = String.valueOf(pObject.getId());
            nReq++;
            System.out.println("LIVRO REQUISITADO");
            System.out.println("Pode requisitar mais "+(3-nReq)+" livros");
            getReq();
        }else{
            System.out.println("NÃO PODE REQUISITAR ESTE LIVRO");
        }
    }

    public String getLivroReq(int i){
        return req[i];
    }

    public void removeReq(Livro pObject, String req){
        for(int i = 0; i < nReq; i++){
            if(req.equals(getLivroReq(i))){
                this.req[i] = null;
                pObject.setTipoEmprestimo("NORMAL");
                nReq--;
            }
            if(this.req[i] == null && i != 2){
                if(i==1){
                    this.req[1] = this.req[2];
                }
                if(i==0 && nReq == 3){
                    this.req[0] = this.req[1];
                    this.req[1] = this.req[2];
                }
                if(i==0 && nReq == 2){
                    this.req[0] = this.req[1];
                }
            }
        }
        System.out.println("Livro devolvido!");
    }

    public void getReq(){
        System.out.println("LISTA DE LIVROS REQUISITADOS: ");
        for(int i = 0; i < nReq; i++){
            System.out.println("Livro com ID " + req[i]);
        }
    }

    public int getNReq(){
        return nReq;
    }

    @Override
    public String toString() {
        return "Aluno: "+getNMec()+"; "+getNome()+"; "+getCurso();
    }
}
