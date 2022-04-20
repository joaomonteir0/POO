package classes;

public class Bolseiro extends Aluno{

    private double montante;

    public Bolseiro(String nome, int cc, Date dataNasc, Date sub, double montante) {
        super(nome, cc, dataNasc, sub);
        this.montante = montante;
    }

    public Bolseiro(String nome, int cc, Date dataNasc, double montante) {
        super(nome, cc, dataNasc);
        this.montante = montante;
    }
    

    public double getBolsa(){
        return this.montante;
    }

    public void setBolsa(double valor){
        this.montante = valor;
    }
    
}
