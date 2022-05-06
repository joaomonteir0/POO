package futebol;

public class Robo extends Movel {
    private String id;
    private String tipo; // posição
    private int golosM; // golos marcados

    private boolean posse;


    public Robo(int x, int y, String id, String tipo){
        super(x,y);
        this.id = id;
        this.tipo = tipo;
        this.golosM = 0;
        this.posse = false;
    }

    public String getID(){
        return this.id;
    }

    public String getTipo(){
        return this.tipo;
    }

    public int getGolosM(){
        return this.golosM;
    }

    public void setGolosM(int golosMarcados){
        this.golosM = golosMarcados;
    }

    public void setID(String id){
        this.id = id;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setPosse(boolean posse){
        this.posse = posse;
    }

    public boolean getPosse(){
        return this.posse;
    }

    public void addGolosMarcados(){
        this.golosM++;
    }

    @Override
    public String toString(){
        return "("+this.getX() + "," + this.getY() + "), id: "+this.getID() + ", tipo: "+this.getTipo()+"\n";
    }
}
