import java.util.Scanner;

public class Main {
    static boolean isPrimeNumber(int n){
        if(n < 2) {
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int start = Math.min(M, N);
        int end = Math.max(M, N);

        for (int i=start; i<=end; i++){
            if(isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }
}