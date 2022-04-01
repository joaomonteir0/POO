import java.lang.String;
import java.util.Scanner;

public class ex1 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String frase = sc.nextLine();
        toLower(frase);
        toUpper(frase);
        lastChar(frase);
        tresChar(frase);
        substituir(frase,'a', '4');
        hash(frase);
    }

    public static void toLower(String x){
        System.out.println("Para minusculo: ");
        System.out.println(x.toLowerCase());
    }

    public static void toUpper(String x){
        System.out.println("Para maiusculo: ");
        System.out.println(x.toUpperCase());
    }

    public static void lastChar(String x){
        System.out.println("Ultimo char: ");
        System.out.println(x.charAt(x.length()-1));
    }

    public static void tresChar(String x){
        System.out.println("Três primeiros carateres: ");
        for(int i = 0; i <=2; i++){
            System.out.print(x.charAt(i));
        }
    }

    public static void substituir(String x,char a, char b){
        System.out.printf("Substituir %c por %c: \n",a,b);
        System.out.println(x.replace(a, b));
    }

    public static void hash(String x){
        System.out.println("Apagar espaço: ");
        System.out.println(x.hashCode());
    }
}
