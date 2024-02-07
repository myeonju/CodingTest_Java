import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        System.out.println(factorial(N) / (factorial(N-K)*factorial(K)));

    }

    static int factorial(int N){
        if(N<=1){
            return 1;
        }
        return N*factorial(N-1);
    }
}