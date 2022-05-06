package futebol;

public abstract class Movel {
    private int x, y;
    private double distanciaP;

    public Movel(int x, int y){
        this.x = x;
        this.y = y;
        this.distanciaP = 0;  // no começo do jogo
    }

    public void move(int newX, int newY){
        this.setDistanciaP(this.distanciaP += Math.sqrt(Math.pow(newX-x, 2) + Math.pow(newY - y, 2)));
        this.x = newX;
        this.y = newY;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setDistanciaP(double d){
        this.distanciaP = d;
    }

    public double getDistanciaP(){
        return this.distanciaP;
    }

}
