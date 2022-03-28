public class ex8 {
    public static void main(String[] args) {
        double [][] notas = new double[16][3];
        // 0 T, 1 P, 2 F
        for(int i = 0; i<16;i++){
            double nota = Math.random() * 20;
            notas[i][0] = nota;
            //System.out.println(nota);
        }
        for(int i = 0; i<16;i++){
            double nota = Math.random() * 20;
            notas[i][1] = nota;
            //System.out.println(nota);
        }
        
        for(int i = 0; i<16;i++){
            notas[i][2] = notas[i][0]*0.4 + notas[i][1]*0.6;
        }
        System.out.println("NotaT \t NotaP \t Pauta");
        for(int i = 0;i<16;i++){
            if(notas[i][1] < 7 || notas[i][0] < 7){
                notas[i][2] = 66;
            }
            System.out.printf("%.1f \t %.1f \t %d \n", notas[i][0], notas[i][1], (int) Math.round(notas[i][2]));
        }
    }
}
