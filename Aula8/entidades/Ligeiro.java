package entidades;

public class Ligeiro implements KmPercorridosInterface{
    private String matricula, marca, modelo, nQuadro;
    private int potencia;
    private double capacidadeBagageira;

    private int distanciaTotal, ultimoTrajeto;

    public Ligeiro(String matricula, String marca, String modelo, String nQuadro, int potencia, double capacidadeBagageira){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.nQuadro = nQuadro;
        this.potencia = potencia;
        this.capacidadeBagageira = capacidadeBagageira;
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

    public void setNQuadro(String nQuadro){
        this.nQuadro = nQuadro;
    }

    public String getNQuadro(){
        return this.nQuadro;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public int getPotencia(){
        return this.potencia;
    }

    public void setCapacidadeBagageira(double capacidade){
        this.capacidadeBagageira = capacidade;
    }

    public double getCapacidadeBagageira(){
        return this.capacidadeBagageira;
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

    @Override
    public String toString() {
        return "Ligeiro: { "
        +"\n  Matricula: "+getMatricula()
        +"\n  Marca: "+getMarca()
        +"\n  Modelo: "+getModelo()
        +"\n  nQuadro: "+getNQuadro()
        +"\n  Potencia: "+getPotencia()
        +"\n  Capacidade Bagageira: "+getCapacidadeBagageira()
        +"\n}";
    }
    
}
