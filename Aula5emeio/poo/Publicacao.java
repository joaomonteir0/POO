package poo;

public class Publicacao {
    private String titulo;
    private int id; // starts in 100
    private static int count = 0;
    private String autor;

    public Publicacao(String titulo, int id, String autor){
         this.titulo = titulo;
         this.id = id;
         this.autor = autor;
         count++;
    }
    public Publicacao(String titulo, int id){
        this.titulo = titulo;
        this.id = id;
        this.autor = "Anonimo";
        count++;
   }

   public Publicacao(String titulo, String autor){
    this.titulo = titulo;
    this.autor = autor;
    this.id = 100 + count;
    this.autor = "Anonimo";
    count++;
}


    public Publicacao(String titulo){
        this.titulo = titulo;
        this.id = 100 + count;
        this.autor = "Anonimo";
        count++;
   }

    public String getTitulo(){
        return this.titulo;
    }

    public int getId() {
        return this.id;
    }

    public String getAutor(){
        return this.autor;
    }

    @Override
    public String toString(){
        return "Título: "+getTitulo()+"; id: "+getId() ;
    }
}
