import java.util.Scanner;

public class Main {
    static boolean isPrime(int n) {
        if(n<2){
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (isPrime(num)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}