package entidades;

public class PesadoPassageiros implements KmPercorridosInterface {
    private String matricula, marca, modelo, nQuadro;
    private int potencia, maximoPassageiros;
    private double peso;

    private int distanciaTotal, ultimoTrajeto;


    public PesadoPassageiros(String matricula, String marca, String modelo, String nQuadro, int potencia, double peso, int maximoPassageiros){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.nQuadro = nQuadro;
        this.potencia = potencia;
        this.peso = peso;
        this.maximoPassageiros = maximoPassageiros;
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

    public void setMaximoPassageiros(int maximoPassageiros){
        this.maximoPassageiros = maximoPassageiros;
    }

    public int getMaximoPassageiros(){
        return this.maximoPassageiros;
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
        return "Pesado de Passageiros: { "
        +"\n  Matricula: "+getMatricula()
        +"\n  Marca: "+getMarca()
        +"\n  Modelo: "+getModelo()
        +"\n  nQuadro: "+getNQuadro()
        +"\n  Potencia: "+getPotencia()
        +"\n  Peso: "+getPeso()
        +"\n  Máximo Passageiros: "+getMaximoPassageiros()
        +"\n}";
    }
    
}
