import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        int wakeup = H * 60 + M - 45;

        if (wakeup < 0) {
            wakeup += 24 * 60; 
        }

        H = wakeup / 60;
        M = wakeup % 60;

        System.out.println(H + " " + M);
    }
}