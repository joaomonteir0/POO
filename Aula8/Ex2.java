import alimentos.*;

public class Ex2 {
    public static void main(String[] args) {
        Alimento carne1 = new Carne(70, 230.2, 400, VariedadeCarne.Frango);
        Alimento peixe1 = new Peixe(63.2, 166.7, 240, TipoPeixe.Fresco);
        Alimento cereal1 = new Cereal(10, 180, 120, "Arroz");
        Alimento legume1 = new Legume(12, 90, 87.2, "Cenoura");

        // criar pratos
        Prato prato1 = new Prato("Arroz de Frango");
        prato1.addAlimento(legume1);
        prato1.addAlimento(carne1);
        prato1.addAlimento(cereal1);
        Prato prato2 = new Prato("Arroz de Legumes");
        prato2.addAlimento(legume1);
        prato2.addAlimento(cereal1);
        Prato prato3 = new Prato("Cenoura e basta");
        prato3.addAlimento(legume1);

        // montar ementa + imprimir
        Ementa ementa = new Ementa("Ementa do Dia");
        ementa.addPrato(prato1);
        ementa.addPrato(prato2);
        ementa.addPrato(prato3);
        System.out.println(ementa);

    }

}
