import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = Integer.MIN_VALUE;

        double[] score = new double[N];
        for (int i = 0; i < N; i++) {
            score[i] = scanner.nextInt();
            if (M <= score[i]) {
                M = (int) score[i];
            }
        }

        double avg = 0.0;
        for (int i = 0; i < N; i++) {
            score[i] = score[i]/M*100;
            avg += score[i];
        }

        System.out.println(avg/N);
    }
}