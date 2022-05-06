package viagem;
import java.util.ArrayList;

public class Agencia {
    private String nome, endereco;
    ArrayList<Alojamento> alojamentos = new ArrayList<Alojamento>();
    ArrayList<Carro> frota = new ArrayList<Carro>();

    public Agencia(String nome, String endereco) {
        this.setNome(nome);
        this.setEndereco(endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void addAlojamento(Alojamento alojamento) {
        this.alojamentos.add(alojamento);
    }

    public void addCarro(Carro carro) {
        this.frota.add(carro);
    }

    public void removeAlojamentoPorCodigo(String codigo) {
        for (Alojamento alojamento : this.alojamentos) {
            if (alojamento.getCodigo().equals(codigo)) {
                this.alojamentos.remove(alojamento);
                return;
            }
        }
    }

    public void removeCarroPorCodigo(String codigo) {
        for (Carro carro : this.frota) {
            if (carro.getCodigo().equals(codigo)) {
                this.frota.remove(carro);
                return;
            }
        }
    }

    public void checkInPorCodigo(String codigo) {
        for (Alojamento alojamento : this.alojamentos) {
            if (alojamento.getCodigo().equals(codigo)) {
                alojamento.checkIn();
                return;
            }
        }
    }

    public void checkOutPorCodigo(String codigo) {
        for (Alojamento alojamento : this.alojamentos) {
            if (alojamento.getCodigo().equals(codigo)) {
                alojamento.checkOut();
                return;
            }
        }
    }

    public void levantarPorCodigo(String codigo) {
        for (Carro carro : this.frota) {
            if (carro.getCodigo().equals(codigo)) {
                carro.levantar();
                return;
            }
        }
    }

    public void entregarPorCodigo(String codigo) {
        for (Carro carro : this.frota) {
            if (carro.getCodigo().equals(codigo)) {
                carro.entregar();
                return;
            }
        }
    }

    public ArrayList<Alojamento> getAlojamentos() {
        return this.alojamentos;
    }

    public ArrayList<Carro> getFrota() {
        return this.frota;
    }

    public String toString() {
        return "\nAgencia:\n" + "\nnome: " + this.getNome() + ",\nendereco: " + this.getEndereco() + ",\nalojamentos: " + this.getAlojamentos() + ",\nfrota: " + this.getFrota()+"\n";
    }
}
