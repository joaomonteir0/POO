import java.lang.Math;

public class Ex1 {

    int temp;

// adicionalmente..
// defina uma variável estática inteira com valor inicial 5
    public static int ini = 5;

// defina a constante MIN, interna à classe, com valor 10
    private final int MIN = 10;

// defina a constante PI de modo a que possa ser usada fora da classe na forma Exemplo.PI
    private final double PI = Math.PI;

// escreva o método getTemp() de forma a que não possa ser redefinido em classes derivadas
    private int getTemp(){
        return this.temp;
    }
}




