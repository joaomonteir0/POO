import poo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class testar {

    public static final Scanner sc  =  new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Utilizador> alunos = new ArrayList<>();
        ArrayList<LivroEletronico> livroEle = new ArrayList<>();
        livroEle.add(new LivroEletronico("Harry Bosta"));
        livroEle.add(new LivroEletronico("Senhor dos Anais")); 
        livroEle.add(new LivroEletronico("Esporra nos Tronos"));
        alunos.add(new Utilizador("Catarina Marques", 80232, "MIEGI"));
        alunos.add(new Utilizador("Catia Foguete", 91467, "MIEET"));
        callListaEBOOK(livroEle);
        requisitarEBOOK(alunos,livroEle);
        requisitarEBOOK(alunos,livroEle);
    }

    public static void callListaEBOOK(ArrayList<LivroEletronico> livroEle){
        System.out.println("\nLista de eBooks: ");
        for(int i=0; i < livroEle.size();i++){
            if(livroEle.get(i).getStatus() != false) System.out.println("ID: ["+i+"]; "+livroEle.get(i));
        }
    }

    public static void requisitarEBOOK( ArrayList<Utilizador> alunos, ArrayList<LivroEletronico> livroEle){
        callListaEBOOK(livroEle);
        System.out.printf("Qual é o ebook (pelo ID) ~> ");
        int opcao = Integer.parseInt(sc.nextLine());

        imprimir_aluno(alunos);
        System.out.printf("Que aluno vai requisitar o ebook (pelo ID) ~> ");
        int opcao2 = Integer.parseInt(sc.nextLine());

        if(alunos.get(opcao2).getebook_status() == true && (livroEle.get(opcao).getStatus() == true)){
            alunos.get(opcao2).setebook_status(false);
            livroEle.get(opcao).setStatus(false);
            System.out.println("Ebook requisitado");
        }else{
            System.out.println("Não pode requisitar este ebook");
        }
        
    }

    public static void imprimir_aluno(ArrayList<Utilizador> alunos){
        System.out.println("\nLISTA DE ALUNOS: ");
        for (int i = 0; i < alunos.size(); i++){
            System.out.println("ID: [" +i +"] ~> "+alunos.get(i));
        }
    }
}
