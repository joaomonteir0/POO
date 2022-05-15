package entidades;

public class LigeiroEletrico extends Ligeiro implements VeiculoEletrico{


    private int autonomia, percentagem;

    public LigeiroEletrico(String matricula, String marca, String modelo, String nQuadro, int potencia,
            double capacidadeBagageira, int autonomia) {
        super(matricula, marca, modelo, nQuadro, potencia, capacidadeBagageira);
        this.autonomia = autonomia;
    }

    @Override
    public int autonomia() {
        return this.autonomia;
    }

    @Override
    public void carregar(int percentagem) {
        this.percentagem = percentagem;
    }
    
}
