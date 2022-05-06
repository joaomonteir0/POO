package futebol;

public class Jogo {
    private Equipa [] equipas = new Equipa[2];
    private Bola bola;
    private static int duracao = 60;
    private int decorrido;

    public Jogo(Bola bola){
        this.bola = bola;
        this.decorrido = 0;
    }

    public Jogo(Equipa [] equipa, Bola bola){
        this.bola = bola;
        this.equipas[0] = equipa[0];
        this.equipas[1] = equipa[1];
        this.decorrido = 0;
    }

    public int getTempoDecorrido() {
        return this.decorrido;
    }
    public int getDuracao() {
        return duracao;
    }

    public Equipa [] getEquipas(){
        return this.equipas;
    }

    public void addTempoDecorrido(int tempo){
        this.decorrido+= tempo;
        if(this.getTempoDecorrido() == getDuracao()){
            terminarJogo();
        }
    }

    public Robo distanciaPercorrida(Equipa equipa, int i){
        Robo robo = equipa.getRobo(i);
        return robo;
    }

    public void terminarJogo(){
        Equipa [] equipas = this.getEquipas();
        System.out.println(">> 60' Jogo finalizado");
        double distancia = 0;
        if(equipas[0].getGolosMarcados() > equipas[1].getGolosMarcados()){
            System.out.println(">> Equipa: "+equipas[0].getNome()+" é o vencedor");
            distancia = distanciaPercorrida(equipas[0], 0).getDistanciaP()+ distanciaPercorrida(equipas[0], 1).getDistanciaP()+distanciaPercorrida(equipas[0], 2).getDistanciaP();
        } else if(equipas[0].getGolosMarcados() < equipas[1].getGolosMarcados()){
            System.out.println(">> Equipa: "+equipas[1].getNome()+" é o vencedor");
            distancia = distanciaPercorrida(equipas[1], 0).getDistanciaP()+ distanciaPercorrida(equipas[1], 1).getDistanciaP()+distanciaPercorrida(equipas[1], 2).getDistanciaP();
        } else if(equipas[0].getGolosMarcados() == equipas[1].getGolosMarcados()){
            System.out.println(">> Houve um empate!");
        }
        System.out.println("A distancia percorrida pela equipa foi: "+distancia+" metros");
    }

    @Override
    public String toString(){
        return  equipas.toString();
    }
}
