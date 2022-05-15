import entidades.*;

public class Ex1 {
    public static void main(String[] args) {
        Ligeiro ligeiro1 = new Ligeiro("PP-23-OJ", "Audi", "TT", "JDSAID121", 200, 130.2);
        Taxi taxi1 = new Taxi("OH-04-20", "BMW", "Coupe", "420K69U24", 230, 109, "232");
        System.out.println(ligeiro1);
        System.out.println(taxi1);

        Empresa empresa1 = new Empresa("Antonio Auto", "2300-102", "toninhoauto@gmail.com");
        empresa1.allViaturas();
        empresa1.addViatura(taxi1);
        empresa1.addViatura(ligeiro1);
        empresa1.allViaturas();
        ligeiro1.trajeto(200);
        ligeiro1.trajeto(220);
        System.out.printf("\nDistancia total de %s = %d km",ligeiro1.getMatricula(), ligeiro1.distanciaTotal());
        System.out.printf("\nUltimo trajeto de %s = %d km",ligeiro1.getMatricula(), ligeiro1.ultimoTrajeto());

        taxi1.trajeto(110);
        taxi1.trajeto(20);
        System.out.printf("\nDistancia total de %s = %d km",taxi1.getMatricula(), taxi1.distanciaTotal());
        System.out.printf("\nUltimo trajeto de %s = %d km",taxi1.getMatricula(), taxi1.ultimoTrajeto());
        
    }
}