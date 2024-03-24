import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] arrA = new int[N][M];
        int[][] arrB = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arrA[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arrB[i][j] += scanner.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(arrA[i][j] + arrB[i][j] + " ");
            }
            System.out.println();
        }

    }
}
