import java.util.*;
import java.io.*;

public class RandomTickets {
    private static List<Person> participantes;
    private static Map<String, String> bilhetes;

    public RandomTickets(List<Person> r, Map<String, String> festivais){
        participantes = r;
        bilhetes = festivais;
    }

    public void getRandomTicket(Person person) {
        if(person.getBilhetesSize()){
            List<String> lista = new ArrayList<>();
            for(String key: bilhetes.keySet()){
                lista.add(key);
            }
            System.out.println("Lista "+ lista);

            int sortearBilhete = (int) (Math.random()*lista.size());
            String resultado = lista.get(sortearBilhete);
            String bilhetesAntes = bilhetes.get(resultado);
            int atualizar = Integer.parseInt(bilhetesAntes) -1;
            bilhetes.put(resultado, String.valueOf(atualizar));
            System.out.println("Bilhete sorteado " + resultado + " Bilhetes antes"+bilhetesAntes+"/"+atualizar+"agora");
            person.addBilhete(resultado);
        }else{
            System.out.println("Já tem dois bilhetes sorteados");
        }
            
    }
}
