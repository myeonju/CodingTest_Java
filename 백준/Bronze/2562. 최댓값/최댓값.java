import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] num = new int[9];

        int max = 0;
        int count = 0;

        for (int i = 0; i < 9; i++) {
            num[i] = scanner.nextInt();

            if (max <= num[i]) {
                max = num[i];
                count = i + 1;
            }
        }

        System.out.println(max + "\n" + count);

    }
}