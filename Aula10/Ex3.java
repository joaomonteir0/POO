import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Uma string ~> ");
            String antonio = sc.nextLine();
            char[] antonioChar = (antonio).toCharArray();
            System.out.println(antonioChar);
            Map<Character, ArrayList<Integer>> element = new HashMap<>();
            for(int i = 0; i < antonioChar.length; i++){
                element.putIfAbsent(antonioChar[i], new ArrayList<Integer>());
                element.get(antonioChar[i]).add(i);
            }
            System.out.println(element);
        }
    }
}
