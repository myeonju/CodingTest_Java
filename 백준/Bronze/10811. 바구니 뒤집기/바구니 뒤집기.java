import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] basket = new int[N];
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int cnt = 0; cnt < M; cnt++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            reverseBasket(basket, i - 1, j - 1);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(basket[i] + " ");
        }
    }

    private static void reverseBasket(int[] basket, int start, int end) {
        while (start < end) {
            int temp = basket[start];
            basket[start] = basket[end];
            basket[end] = temp;
            start++;
            end--;
        }
    }
}
