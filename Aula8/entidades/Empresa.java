package entidades;
import java.util.ArrayList;

public class Empresa {
    private String nome, codigoPostal, email;
    private ArrayList<Object> veiculos = new ArrayList<Object>();

    public Empresa(String nome, String codigoPostal, String email){
        this.nome = nome;
        this.codigoPostal = codigoPostal;
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String codigoPostal(){
        return this.codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal){
        this.codigoPostal = codigoPostal;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void addViatura(Object veiculo){
        this.veiculos.add(veiculo);
    }
    
    public void allViaturas(){
        System.out.printf("Viaturas de %s [", this.getNome());
        if(veiculos.size() > 0){
            for (Object object : veiculos) {
                System.out.println(object);
            }
        }else{
            System.out.println("\n  0 viaturas");
        }
        System.out.println("]");
    }
}
