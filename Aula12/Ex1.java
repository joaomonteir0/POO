import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ex1{
    public static PrintWriter writer;
    public static Scanner sc;
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        sc = new Scanner(new File("texto.txt"));
        while (sc.hasNext()){
            List<String> splited = Arrays.asList(sc.next().split("\\W"));
            splited.forEach(e->{
                set.add(e);
                list.add(e);
            });
        }
        System.out.println("Número Total de Palavras: " + Integer.toString(list.size()));
        System.out.println("Número de Diferentes Palavras: " + Integer.toString(set.size()) + "\n");
    }
}