package futebol;

public class Bola extends Movel {
    private String cor;
    public Bola(int x, int y, String cor) {
        super(x, y);
        this.cor = cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }
}
