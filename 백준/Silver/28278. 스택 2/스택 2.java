import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    int x = scanner.nextInt();
                    stack.add(x);
                    break;
                case 2:
                    if(!stack.isEmpty()){
                        builder.append(stack.pop()).append("\n");
                    }else{
                        builder.append(-1).append("\n");
                    }
                    break;
                case 3:
                    builder.append(stack.size()).append("\n");
                    break;
                case 4:
                    if(stack.isEmpty()){
                        builder.append(1).append("\n");
                    }else{
                        builder.append(0).append("\n");
                    }
                    break;
                case 5:
                    if(!stack.isEmpty()){
                        builder.append(stack.peek()).append("\n");
                    }else {
                        builder.append(-1).append("\n");
                    }
                    break;
            }
        }
        System.out.println(builder);
    }
}