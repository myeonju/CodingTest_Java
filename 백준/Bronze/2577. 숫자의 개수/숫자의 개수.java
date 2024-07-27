import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int mul = A * B * C;
        String mulStr = String.valueOf(mul);

        int[] numArr = new int[10];

        for (int i = 0; i < mulStr.length(); i++) {
            char numStr = mulStr.charAt(i);
            numArr[numStr - '0']++;
        }

        for (int count : numArr) {
            System.out.println(count);
        }
    }
}
