import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.println(ps(scanner.next()));
        }
    }
    public static String ps(String s){

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c =s.charAt(i);

            if(c=='('){
                stack.add(c);
            }else if(stack.empty()){
                return "NO";
            }else{
                stack.pop();
            }
        }

        if(stack.empty()){
            return "YES";
        }else{
            return "NO";
        }
    }
}