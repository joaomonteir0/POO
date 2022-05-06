import futebol.*;
import java.util.Random;
public class ex4 {

    public static final Random rnd = new Random();

    public static void main(String[] args) {
        Equipa [] equipas = new Equipa[2];
        Bola bola = new Bola(0,0,"Preta");
        equipas[0] = new Equipa("Floristas FC", "Antonio Adrego");
        equipas[1] = new Equipa("União Biológica FC", "Martinha");
        System.out.println(equipas[0]+""+equipas[1]);

        Jogo game = new Jogo(equipas,bola);
        for(int i = 0; i < game.getDuracao(); i++){
            gameAction(game, i);
            game.addTempoDecorrido(1);
        }
    }

    public static void gameAction(Jogo game, int tempo){
        int action = rnd.nextInt(10);
        int nplayer1 = rnd.nextInt(2)+1;
        int nplayer2 = rnd.nextInt(2)+2;

        int x = rnd.nextInt(100)+1;
        int y = rnd.nextInt(33)+1;

        int equipaAtaca= rnd.nextInt(2);

        int probGolo = rnd.nextInt(35);
        jogar(game, tempo,action, nplayer1, nplayer2,x,y, equipaAtaca, probGolo);
    }

    public static int getNAvancados(Equipa equipa){
        int count = 1; // padrao se n tiver avançados
        for(int i = 0; i < 3; i++){
            if(equipa.getRobo(i).getTipo() == "Avançado"){
                count++;
            }
        }
        return count;
    }

    public static void jogar(Jogo game, int tempo, int action, int nplayer1,int nplayer2, int x, int y, int equipaAtaca, int probGolo){
        Equipa equipa1 = game.getEquipas()[0];
        Equipa equipa2 = game.getEquipas()[1];
        int nAvancados1, nAvancados2;
        nAvancados1 = getNAvancados(equipa1);
        nAvancados2 = getNAvancados(equipa2);

        for(int i = 0; i < 3; i++){
            equipa1.getRobo(i).move(x, y);
        }
        for(int i = 0; i < 3; i++){
            equipa2.getRobo(i).move(x, y);
        }
        
        switch (equipaAtaca) {
            case 0:
                if(action < 3){
                    System.out.println(">> "+tempo+"' "+equipa1.getNome()+" perdeu a posse de bola!");
                    break;
                }else{
                    System.out.println(">> "+tempo+"' "+equipa1.getNome()+" remate!");
                    if(probGolo/nAvancados1 < 2){
                        System.out.println(">> "+tempo+"' "+equipa1.getNome()+" GOOOOOOOOLO, marca o nº"+equipa1.getRobo(nplayer1).getID()+"!");
                        equipa1.incrementarGolosM();
                        System.out.println(">> "+tempo+"' "+equipa1.getGolosMarcados()+" - " + equipa2.getGolosMarcados());
                    }
                }
                break;
            case 1: 
                if(action < 3){
                    System.out.println(">> "+tempo+"' "+equipa2.getNome()+" perdeu a posse de bola!");
                    break;
                }else{
                    System.out.println(">> "+tempo+"' "+equipa2.getNome()+" remate!");
                    if(probGolo/nAvancados2 < 2){
                        System.out.println(">> "+tempo+"' "+equipa2.getNome()+" GOOOOOOOOLO, marca o nº"+equipa2.getRobo(nplayer2).getID()+"!");
                        equipa2.incrementarGolosM();
                        System.out.println(">> "+tempo+"' "+equipa1.getGolosMarcados()+" - " + equipa2.getGolosMarcados());
                    }
                }
                break;
        }
    }
}
