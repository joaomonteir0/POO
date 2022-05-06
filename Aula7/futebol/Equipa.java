package futebol;
import java.util.Random;

public class Equipa {

    public static final Random rnd = new Random();

    private String nome;
    private String responsavel;
    private int golosMarcados;
    private int golosSofridos;
    private Robo [] jogadores = new Robo[3];
    
    public static int count = 0;


    public Equipa(String nome, String responsavel){
        this.nome = nome;
        this.responsavel = responsavel;
        this.golosMarcados = 0;
        this.golosSofridos = 0;
        this.jogadores = addRobos();
    }

    public Robo getRobo(int i){
        return this.jogadores[i];
    }

    public String getNome(){
        return this.nome;
    }

    public String getResponsavel(){
        return this.responsavel;
    }

    public int getGolosMarcados(){
        return this.golosMarcados;
    }

    public int getGolosSofridos(){
        return this.golosSofridos;
    }

    public void setGolosM(int i){
        this.golosMarcados = i;
    }

    public void incrementarGolosM(){
        this.golosMarcados++;
    }

    public void setGolosS(){
        this.golosSofridos++;
    }


    public Robo[] addRobos(){
        Robo [] membros = new Robo[3];
        Robo GR = new Robo(0,0,String.valueOf(count), "GR");
        membros[0] = GR;
        count++;
        for(int i = 1; i < 3; i++){
            int random = rnd.nextInt(3);
            String pos = "";
            if(random == 0){
                pos = "Avançado";
            }else if(random == 1){
                pos = "Medio";
            }else if(random == 2){
                pos = "Defesa";
            }
            Robo newObj = new Robo(0,0,String.valueOf(count), pos);
            membros[i] = newObj;
            count++;
        }
        return membros;
    }

    @Override
    public String toString(){
        return "Equipa: "+this.getNome()+" - Responsável: "+this.getResponsavel()+"\nJogadores:\n"+jogadores[0]+ "" + jogadores[1]+ "" + jogadores[2]+"\n";
    }

}
