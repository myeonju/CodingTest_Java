import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        int N = scanner.nextInt();

        for(int i=0; i<N; i++){
            String input = scanner.next();
            switch (input){
                case "push":
                    stack.add(scanner.nextInt());
                    break;
                case "pop":
                    if(stack.isEmpty()){
                        sb.append(-1);
                    } else{
                        sb.append(stack.pop());
                    }
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if(stack.isEmpty()){
                        sb.append(1);
                    } else{
                        sb.append(0);
                    }
                    sb.append("\n");
                    break;
                case "top":
                    if(stack.isEmpty()){
                        sb.append(-1);
                    }else {
                        sb.append(stack.peek());
                    }
                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}