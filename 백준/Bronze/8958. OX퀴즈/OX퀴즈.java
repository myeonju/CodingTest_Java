import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            int sum = 0;
            int continuity = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    continuity++;
                    sum += continuity;
                } else {
                    continuity = 0;
                }
            }

            System.out.println(sum);
        }
    }
}
