import java.io.*;
import java.util.*;


public class Ex1 {
    public static PrintWriter print;
    public static Scanner input;

    public static Map<String, String> data = new HashMap<>();
    public static void main(String[] args) {
        data.put("baleia","Animal");
        data.put("Branco", "Cor da neve");
        data.put("Toy", "Vou dançar");
        data.put("Verde", "Cor do Sporting");
        data.put("Humus","Porto");
        System.out.println(data.toString());
        data.remove("Branco");
        System.out.println(data.toString());

        System.out.println(data.get("Toy"));

        for (Map.Entry<String, String> element : data.entrySet()){
            System.out.println("Termo: "+element.getKey() +" - Significado: "+ element.getValue());
        }
        
        for (Map.Entry<String, String> element : data.entrySet()){
            System.out.println("Termo: "+element.getKey());
        }

        for (Map.Entry<String, String> element : data.entrySet()){
            System.out.println("Significado: "+element.getValue());
        }


    }
}