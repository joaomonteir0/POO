import Pessoa.Pessoa;
public class Ex2 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria");

        Pessoa p2 = new Pessoa("Maria");

        

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}
