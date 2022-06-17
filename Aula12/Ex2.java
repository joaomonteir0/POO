import java.util.*;
import java.io.*;


public class Ex2 {
    public static PrintWriter file;
    public static Scanner sc;
    public static void main(String[] args) throws FileNotFoundException {
        //a
        System.out.println("Lista:");
        List<Movie> ListaMovies = new ArrayList<>();
        sc = new Scanner(new File("movies.txt"));
        while(sc.hasNextLine()){
            String linha = sc.nextLine();
            if(linha == "name\tscore\trating\tgenre\trunning time"){ 
                continue; 
            }
            String[] splited = sc.nextLine().split("\t");
            ListaMovies.add(new Movie(splited[0], splited[1], splited[2], splited[3], splited[4]));
        }
        sc.close();
        printlist(ListaMovies);

        //b
        System.out.println("\nLista ordenada");
        Collections.sort(ListaMovies, Comparator.comparing(e -> e.getName()));
        printlist(ListaMovies);

        //c
        System.out.println("\n.1)");
        Collections.sort(ListaMovies, Comparator.comparing(e -> Double.parseDouble(e.getScore())));
        Collections.reverse(ListaMovies);
        printlist(ListaMovies);
        System.out.println("\n.2)");
        Collections.sort(ListaMovies, Comparator.comparing(e -> Double.parseDouble(e.getRunningTime())));
        printlist(ListaMovies);

        //d
        System.out.println("\nd)");
        Set<String> generos = new HashSet<>();
        ListaMovies.forEach(e -> generos.add(e.getGender()));
        System.out.println("Géneros Disponíveis:");
        generos.forEach(e -> System.out.println(e));

        //e 
        file = new PrintWriter(new File("myselection.txt"));
        List<Movie> selectedMovies = new ArrayList<>();
        ListaMovies.forEach(e -> {
            if (Double.parseDouble(e.getScore())>60 && e.getGender().equals("comedy")){
                selectedMovies.add(e);
            } 
        });
        file.printf("%-40s %-10s %-10s %-10s %-15s\n", "name", "score", "rating", "gender", "running time");
        for(int i = 0; i < selectedMovies.size(); i++){
            file.printf("%-40s %-10s %-10s %-10s %-15s\n",selectedMovies.get(i).getName(), selectedMovies.get(i).getScore(),selectedMovies.get(i).getRating(), selectedMovies.get(i).getGender(), selectedMovies.get(i).getRunningTime());
        }
        file.close();
        printlist(selectedMovies);
        
    }

    public static void printlist(List<Movie> list){
        //name	score	rating	gender	running time
        System.out.printf("%-40s %-10s %-10s %-10s %-15s\n", "name", "score", "rating", "gender", "running time");
        for(int i = 0; i < list.size(); i++){
            System.out.printf("%-40s %-10s %-10s %-10s %-15s\n", list.get(i).getName(), list.get(i).getScore(),
            list.get(i).getRating(), list.get(i).getGender(), list.get(i).getRunningTime());
        }
    }   
}
