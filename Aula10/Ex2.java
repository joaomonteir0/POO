import java.io.*;
import java.util.*;


public class Ex2 {
    public static PrintWriter print;
    public static Scanner sc = new Scanner(System.in);

    public static Map<String, String[]> data = new HashMap<>();
    public static void main(String[] args) {
        data.put("baleia",new String[]{"Animal","Gordo","Feio"});
        data.put("Branco",new String[]{"Cor","Clara","Feia"});
        data.put("Godzilla",new String[]{"Monstrinho","Lampião","Feio"});

        Map<String, String[]> sortedData = new TreeMap<>(data);

        for (Map.Entry<String, String[]> element : sortedData.entrySet()){
            System.out.printf(element.getKey()+" - { ");

            for (String a : element.getValue()){
                System.out.printf(a.toString() +" ");
            }
            System.out.println("}");
        }

        pesquisar();

    }

    public static void pesquisar(){
        String termo = "";
        while(true){
            System.out.print("Termo? ");
            termo = sc.next();
            sc.nextLine();
            int i = (int)(Math.random() * data.get(termo).length);
            System.out.println(data.get(termo)[i]);
        }
    }
}