import java.util.Scanner;

public class ex3 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("Uma frase ~> ");
        String frase = sc.nextLine();
        System.out.println("Acrónimo: " + acronimo(frase));
        sc.close();
    }

    public static String acronimo(String frase) {
        String result = ""; 
        String[] partes = frase.split(" ");
        for(int i = 0; i < partes.length; i++){
            if(partes[i].length() < 3){
                continue;
            }else{
                result = result + Character.toUpperCase(partes[i].charAt(0));
            }
        }
        return result;
    }
}
