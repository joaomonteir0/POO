package poo;

public class PublicacaoConsulta extends Publicacao{

    public PublicacaoConsulta(String titulo) {
        super(titulo);
    }

    @Override
    public String toString(){
        return "Titulo: "+getTitulo();
    }
    
}
