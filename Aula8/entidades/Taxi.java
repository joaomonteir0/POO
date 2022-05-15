package entidades;

public class Taxi extends Ligeiro {
    private String nLicenca;

    public Taxi(String matricula, String marca, String modelo, String nQuadro, int potencia,
            double capacidadeBagageira, String nLicenca) {
        super(matricula, marca, modelo, nQuadro, potencia, capacidadeBagageira);
            this.nLicenca = nLicenca;
    }

    public void setNLicenca(String licenca){
        this.nLicenca = licenca;
    }

    public String getNLicenca(){
        return this.nLicenca;
    }

    @Override
    public String toString() {
        return "\nTaxi: { "
        +"\n  Matricula: "+getMatricula()
        +"\n  Marca: "+getMarca()
        +"\n  Modelo: "+getModelo()
        +"\n  nQuadro: "+getNQuadro()
        +"\n  Potencia: "+getPotencia()
        +"\n  Capacidade Bagageira: "+getCapacidadeBagageira()
        +"\n  Licença: "+getNLicenca()
        +"\n}";
    }
    
}
