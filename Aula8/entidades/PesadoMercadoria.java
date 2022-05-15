package entidades;

public class PesadoMercadoria implements KmPercorridosInterface{
    private String matricula, marca, modelo, nQuadro;
    private int potencia;
    private double peso, cargaMaxima;

    private int distanciaTotal, ultimoTrajeto;


    public PesadoMercadoria(String matricula, String marca, String modelo, String nQuadro, int potencia, double peso, double cargaMaxima){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.nQuadro = nQuadro;
        this.potencia = potencia;
        this.peso = peso;
        this.cargaMaxima = cargaMaxima;
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

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setCargaMaxima(double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaMaxima(){
        return this.cargaMaxima;
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
        return "Pesado de Mercadorias: { "
        +"\n  Matricula: "+getMatricula()
        +"\n  Marca: "+getMarca()
        +"\n  Modelo: "+getModelo()
        +"\n  nQuadro: "+getNQuadro()
        +"\n  Potencia: "+getPotencia()
        +"\n  Peso: "+getPeso()
        +"\n  Carga Máxima: "+getCargaMaxima()
        +"\n}";
    }
    
}
