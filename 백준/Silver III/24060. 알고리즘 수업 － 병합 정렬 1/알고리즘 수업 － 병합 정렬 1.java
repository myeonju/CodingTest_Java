import java.util.*;

public class Main {
    static int[] tmp;
    static int cnt = 0;
    static int result = -1;
    static int K;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        K = scanner.nextInt();

        int[] A = new int[N];
        tmp = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        merge_sort(A, 0, N - 1);
        System.out.println(result);
    }

    private static void merge_sort(int[] arr, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(arr, p, q);
            merge_sort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    private static void merge(int[] arr, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r) {
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }

            cnt++;
            if (cnt == K) {
                result = tmp[t-1];
                return;
            }
        }

        while (i <= q) {
            tmp[t++] = arr[i++];
            cnt++;
            if (cnt == K) {
                result = tmp[t-1];
                return;
            }
        }

        while (j <= r) {
            tmp[t++] = arr[j++];
            cnt++;
            if (cnt == K) {
                result = tmp[t-1];
                return;
            }
        }

        for (int k = p; k <= r; k++) {
            arr[k] = tmp[k - p];
        }
    }
}
