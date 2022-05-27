import java.io.*;
import java.util.*;

public class Ex4 {
    public static void main(String[] args) throws IOException{ 
        Scanner input = new Scanner(new FileReader("words.txt"));
        ArrayList<String> elementos = new ArrayList<>(); 
        while (input.hasNext()) { 
         String word = input.next(); 
         System.out.println(word); 
         if(word.length() > 2){
             elementos.add(word);
         }
        }
        System.out.println(elementos.toString());

        input = new Scanner(new File("words.txt"));
        while(input.hasNext()){
            String word = input.next();
            if(word.endsWith("s")){
                System.out.print(word + " ");
            }
        }
        System.out.println();

        for(int i = 0; i < elementos.size();i++){
            if(!elementos.get(i).matches("^[a-zA-Z]+")){
                elementos.remove(i);
            }
        }
        System.out.println(elementos.toString());
        input.close();
    }
} 
       
      
