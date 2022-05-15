package entidades;

public class PesadoPassageirosEletrico extends PesadoPassageiros  implements VeiculoEletrico {

    private int autonomia, percentagem;
    public PesadoPassageirosEletrico(String matricula, String marca, String modelo, String nQuadro, int potencia,
            double peso, int maximoPassageiros, int autonomia) {
        super(matricula, marca, modelo, nQuadro, potencia, peso, maximoPassageiros);
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
