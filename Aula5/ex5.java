import java.util.ArrayList;
import java.util.Scanner;
import poo.*;
public class ex5 {

    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Utilizador> alunos = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();
        alunos.add(new Utilizador("Catarina Marques", 80232, "MIEGI"));
        alunos.add(new Utilizador("Catia Foguete", 91467, "MIEET"));
        livros.add(new Livro("Antonio Zambujo", "NORMAL"));
        livros.add(new Livro("João Félix não sabe jogar", "CONDICIONAL"));
        livros.add(new Livro("Odisseia", "NORMAL"));
        int op;
        while(true){
            System.out.println("MENU: ");
            System.out.println("1 - inscrever utilizador");
            System.out.println("2 - remover utilizador");
            System.out.println("3 - imprimir lista de utilizadores");
            System.out.println("4 - registar um novo livro");
            System.out.println("5 - imprimir lista de livros");
            System.out.println("6 - emprestar");
            System.out.println("7 - devolver");
            System.out.println("8 - sair");
            op = Integer.parseInt(sc.nextLine());
            switch (op){
                case 1:
                    inscrever_aluno(alunos);
                    break;
                case 2:
                    remover_aluno(alunos);
                    break;
                case 3:
                    imprimir_aluno(alunos);
                    break;
                case 4:
                    inscrever_livro(livros);
                    break;
                case 5:
                    imprimir_livros(livros);
                    break;
                case 6:
                    requisitar(alunos, livros);
                    break;
                case 7:
                    devolver(alunos, livros);
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void inscrever_livro(ArrayList<Livro> livros){
        livros.add(registrar_livro());
    }

    public static Livro registrar_livro(){
        String nome, emprestimo;
        System.out.printf("Titulo ~> ");
        nome = sc.nextLine();
        System.out.printf("Emprestimo (NORMAL/CONDICIONAL) ~> ");
        emprestimo = sc.nextLine();

        Livro novoLivro = new Livro(nome, emprestimo);
        return novoLivro;
    }

    public static void requisitar(ArrayList<Utilizador> alunos, ArrayList<Livro> livros){
        imprimir_livros(livros);
        System.out.printf("\nQual livro quer requisitar (pelo ID)? ~> ");
        int req = Integer.parseInt(sc.nextLine());
        imprimir_aluno(alunos);
        System.out.printf("\nQual aluno vai requisitar (pelo ID)? ~> ");
        int aluno = Integer.parseInt(sc.nextLine());
        if(alunos.get(0).getNReq() < 3){
            alunos.get(aluno).requisitar(livros.get(req));
        }else{
            System.out.println("Primeiro tem de devolver um livro!");
        }
    }

    public static void devolver(ArrayList<Utilizador> alunos, ArrayList<Livro> livros){
        imprimir_aluno(alunos);
        System.out.printf("Qual aluno vai devolver um livro (pelo ID)? ~> ");
        int aluno = Integer.parseInt(sc.nextLine());
        int nreq = alunos.get(aluno).getNReq();
        if(nreq > 0){
            for(int k = 0; k < nreq; k++){
                for(int i = 0; i < livros.size(); i++){
                    if(livros.get(i).getId() == Integer.parseInt(alunos.get(aluno).getLivroReq(k))){
                        System.out.println("ID: "+i+" ~> "+livros.get(i));
                    }
                }
            }
            System.out.printf("Qual livro quer devolver (pelo ID) ~> ");
            int devolver = Integer.parseInt(sc.nextLine());
            alunos.get(aluno).removeReq(livros.get(devolver), alunos.get(aluno).getLivroReq(devolver));

        }else{
            System.out.println("Este aluno não requisitou nada!");
        }
    }

    public static void imprimir_livros(ArrayList<Livro> livros){
        System.out.println("\nLISTA DE LIVROS: ");
        for(int i =0; i < livros.size();i++){
            System.out.println("ID: ["+i+"] ~> "+livros.get(i));
        }
    }

    public static void imprimir_aluno(ArrayList<Utilizador> alunos){
        System.out.println("\nLISTA DE ALUNOS: ");
        for (int i = 0; i < alunos.size(); i++){
            System.out.println("ID: [" +i +"] ~> "+alunos.get(i));
        }
    }

    public static void remover_aluno(ArrayList<Utilizador> alunos){
        imprimir_aluno(alunos);
        System.out.printf("Qual aluno quer remover (pelo id) ~> ");
        int remover = Integer.parseInt(sc.nextLine());
        alunos.remove(remover);
        System.out.println("Lista atualizada: ");
        imprimir_aluno(alunos);
    }

    public static void inscrever_aluno(ArrayList<Utilizador> alunos){
        alunos.add(registrar_aluno());
        System.out.println(alunos.toString());
    }

    public static Utilizador registrar_aluno(){
        String nome, curso;
        int nmec;
        System.out.printf("Nome ~> ");
        nome = sc.nextLine();
        System.out.printf("NMec ~> ");
        nmec = Integer.parseInt(sc.nextLine());
        System.out.printf("Curso ~> ");
        curso = sc.nextLine();
        System.out.println(nome+nmec+curso);
        Utilizador novoAluno = new Utilizador(nome, nmec, curso);
        return novoAluno;

    }
}
