import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        int cnt = 1;
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();

            if (num == cnt) {
                stack1.add(num);
                cnt++;

                while (!stack2.isEmpty() && stack2.peek() == cnt) {
                    stack1.add(stack2.pop());
                    cnt++;
                }
            } else {
                stack2.add(num);
            }
        }

        if (stack2.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}