import java.util.ArrayList;
import java.util.Scanner;
import poo.*;
public class ex5 {

    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //ArrayList<Utilizador> alunos = new ArrayList<>();
        ArrayList<Utilizador> alunos = new ArrayList<>();
        alunos.add(registrar());
        System.out.println(alunos);
    }

    public static Utilizador registrar(){
        String nome, curso;
        int nmec;

        nome = sc.nextLine();
        curso = sc.nextLine();
        nmec = sc.nextInt();
        Utilizador novoAluno = new Utilizador(nome, nmec, curso);
        return novoAluno;

    }
}
