import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import classes.*;
public class Ex2 {
    public static PrintWriter file;
    public static Scanner sc;
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, String> companhias = new HashMap<>();
        sc =  new Scanner(new File("companhias.txt"));
        while(sc.hasNextLine()){
            String linha = sc.nextLine();
            String[] dados = linha.split("\t");
            for(int i = 0; i < dados.length; i++){
                companhias.put(dados[0], dados[1]);
            }
        }
        System.out.println(companhias);
        sc.close();

        //b
        ArrayList<Voo> voos = new ArrayList<>();
        sc = new Scanner(new File("voos.txt"));
        String title = sc.nextLine();
        while(sc.hasNextLine()){
            String linha = sc.nextLine();
            String[] dados = linha.split("\t");
            Voo novo;
            String atraso = " ";
            String companhia = " ";
            for(int i = 0; i < dados.length;i++){
                if(dados.length < 4){
                    atraso = " ";
                }else{
                    atraso = dados[3];
                }
                String sigla = ""+dados[1].charAt(0)+dados[1].charAt(1)+"";
                companhia = companhias.get(sigla);
            }
            voos.add (new Voo(dados[0], dados[1],companhia, dados[2],atraso, " "));
        }
        file = new PrintWriter(new File("Infopublico.txt"));
        file.printf("%-7s %-10s %-20s %-20s %-10s %-15s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
        for(int i = 0; i < voos.size(); i++){
            file.printf("%-7s %-10s %-20s %-20s %-10s %-15s\n", voos.get(i).getHora(), voos.get(i).getVoo(), voos.get(i).getCompanhia(), voos.get(i).getOrigem(), voos.get(i).getAtraso(), voos.get(i).getObs()); 
        }

        //c
        Map<String, Integer> atrasos = new HashMap<>();
        double totalAtraso = 0;
        for(Voo fly : voos){
            String companhia = fly.getCompanhia();
            System.out.println(companhia);
            if(companhia != null){
                String sigla = ""+companhia.charAt(0)+companhia.charAt(1)+"";
                int atraso = fly.getAtrasoInt();
                if(atraso > 0){
                    totalAtraso+=atraso;
                    System.out.println(sigla + atraso);
                    atrasos.put(sigla, atraso);  
                }
            }
        }
        System.out.println(atrasos);



    }
}