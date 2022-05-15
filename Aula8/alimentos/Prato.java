package alimentos;

import java.util.ArrayList;

public class Prato {
    private String nome;
    private ArrayList<Alimento> composicao = new ArrayList<Alimento>();
    private static int count =  0;
    private int id;
    private double maxCalorias = 100;
    public Prato(String nome){
        this.nome = nome;
        this.id = count;
        count++;
    }

    public String getNome(){
        return this.nome;
    }

    public void addAlimento(Alimento obj){
        composicao.add(obj);
    }

    public void getComposicao(){
        System.out.println("Prato: "+this.getNome());
        for(int i = 0; i < this.composicao.size(); i++){
            System.out.println(composicao.get(i));
        }
    }

    public double getMaxCalorias(){
        return this.maxCalorias;
    }

    public boolean isDiet(){
        double total = 0;
        for(Alimento i : composicao){
            total+= i.getCalorias();
        }
        if(total >= getMaxCalorias()){
            return false;
        }
        return true;
    }

    public double getCalorias(){
        double total = 0;
        for(Alimento i : composicao){
            total+= i.getCalorias();
        }
        return total;
    }

    public int getId(){
        return this.id;
    }

    public boolean isVegetarian(){
        boolean regulador;
        for(Alimento a : this.composicao){
            regulador =  a.isVegetarian();
            if(regulador == false){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString(){
        return "Prato ID:["+getId()+"]: "+this.nome+", Qtd ingredientes: "+this.composicao.size()+", vegetariano? "+this.isVegetarian()+", prato deita? "+this.isDiet();
    }

    public int compareTo(Prato obj){
        if(this.getCalorias() < obj.getCalorias()){
            return -1; // -1 em x.compareTo(y) se x < y
        }else if(this.getCalorias() > obj.getCalorias()){
            return 1; // -1 em x.compareTo(y) se x > y
        }
        return 0; // -1 em x.compareTo(y) se x = y
    }
}
