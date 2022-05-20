import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import classes.*;

public class Ex1{
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for(int i = 10; i <= 100; i+=10){
            c1.add(i);
        }
        System.out.println("Size: "+c1.size());
        for(int i = 0; i < c1.size(); i++){
            System.out.println("Elemento: "+c1.get(i));
        }

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);

        Set<Pessoa> c3 = new HashSet<>();
        Date data1 = new Date(20, 1, 2001);
        Date data2 = new Date(20, 2, 1998);

        Pessoa p1 = new Pessoa("Antonio", 10, data1);
        Pessoa p2 = new Pessoa("Joaquim", 12, data1);
        Pessoa p3 = new Pessoa("Ana Patrícia", 101, data2);
        Pessoa p4 = new Pessoa("Gonçalo Posta", 13, data1);
        Pessoa p5 = new Pessoa("André Dentolas", 17, data2);
        // b
        c3.add(p1);
        c3.add(p2);
        c3.add(p3);
        c3.add(p4);
        c3.add(p5);
        System.out.println("HashSet: "+c3);
        // c
        Set<Date> c4 = new TreeSet<>();
        c4.add(new Date(20, 2, 2000));
        for(Date date : c4){
            System.out.println(date);
        }
    }
}