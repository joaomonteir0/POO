import java.util.Scanner;

public class ex2 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("Uma frase ~> ");
        String frase = sc.nextLine();
        System.out.println("Número de carateres numéricos: "+countDigits(frase));
        System.out.println("Número de espaços: " + countSpace(frase));
        allLowerCase(frase);
        deleteSpace(frase);
        checkPalindrome(frase);
        sc.close();

    }

    public static int countDigits(String frase){
        int count = 0;
        for(int i = 0;i < frase.length(); i++){
            Boolean flag = Character.isDigit(frase.charAt(i));
            if(flag){
                count++;
            }   
        }
        return count;
    }

    public static int countSpace(String frase){
        int count = 0;
        for(int i = 0;i < frase.length(); i++){
            if(frase.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }

    public static void allLowerCase(String frase){
        if(frase == frase.toUpperCase()){
            System.out.println("Contém só minúsculas");
        }else{
            System.out.println("Não contém só minúsculas");
        }
    }

    public static void checkPalindrome(String frase){
        int ctr = 0;
        for (int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == frase.charAt(frase.length()-i-1)){
                ctr++;
            }
        }
        if (ctr == frase.length()){
            System.out.println("É palindromo!");
            
        } else {
            System.out.println("Não é palindromo!");
        }
    }
    public static void deleteSpace(String s) {
        System.out.println(s.trim().replaceAll(" +", " "));
    }

}