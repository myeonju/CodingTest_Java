import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] number = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            number[i] = scanner.nextInt();
            sum += number[i];
        }

        Arrays.sort(number);

        System.out.println(sum/5 + "\n" + number[2]);

    }

}