import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] time = new int[N];

        for (int i = 0; i < N; i++) {
            time[i] = scanner.nextInt();
        }

        Arrays.sort(time);

        int timeSum = 0;
        int sum=0;

        for (int i = 0; i < N; i++) {
            sum += time[i];
            timeSum += sum;
        }

        System.out.println(timeSum);
    }
}