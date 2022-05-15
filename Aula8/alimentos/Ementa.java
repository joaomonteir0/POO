package alimentos;

import java.util.ArrayList;

public class Ementa {
    private String nome;
    private ArrayList<Prato> ementa = new ArrayList<Prato>(); 

    public Ementa(String nome){
        this.nome = nome;
    }

    public void addPrato(Prato prato){
        ementa.add(prato);
    }

    public String getNome() {
        return this.nome;
    }
    

    @Override
    public String toString() {
        String lista = "";
        for(int i = 0; i < ementa.size(); i++){
            lista += ementa.get(i)+"\n";
        }
        return "Ementa: \n"+lista;
    }

}
