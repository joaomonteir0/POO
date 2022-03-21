import java.util.Scanner;
// Escreva uma função estática para, dada umaString, conte e retorne o número de ocorrências do caráter ‘Z’
public class exTP3x6 {
    public static final Scanner sc = new Scanner(System.in);

    private static int countZs(String a){
        int count = 0;
        char someChar = 'Z';
        for(int i = 0; i<a.length();i++){

            if(a.charAt(i) == someChar){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        System.out.printf("String: ");
        String a = sc.nextLine();
        int ocorrencias = countZs(a);
        System.out.printf("Existem %d char Z", ocorrencias);

    }
}
