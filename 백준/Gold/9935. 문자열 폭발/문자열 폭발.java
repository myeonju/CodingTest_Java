import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String bomb = scanner.next();

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<S.length(); i++){
            stack.add(S.charAt(i));

            if(stack.size() >= bomb.length()) {
                boolean flage = true;
                for(int j=0; j<bomb.length(); j++){
                    if(stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)){
                        flage = false;
                        break;
                    }
                }

                if(flage){
                    for(int j=0; j<bomb.length(); j++){
                        stack.pop();
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch:stack){
            sb.append(ch);
        }

        if(sb.length()>0){
            System.out.println(sb);
        } else{
            System.out.println("FRULA");
        }

    }
}
