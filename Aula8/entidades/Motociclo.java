package entidades;

public class Motociclo implements KmPercorridosInterface {
    private String matricula, marca, modelo, tipo;
    private int potencia;
    
    private int distanciaTotal, ultimoTrajeto;


    public Motociclo(String matricula, String marca, String modelo, String tipo, int potencia){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public int getPotencia(){
        return this.potencia;
    }


    @Override
    public void trajeto(int quilometros) {
        this.distanciaTotal+=quilometros;
        this.ultimoTrajeto = quilometros;
    }

    @Override
    public int ultimoTrajeto() {
        return this.ultimoTrajeto;
    }

    @Override
    public int distanciaTotal() {
        return this.distanciaTotal;
    }
    
}
