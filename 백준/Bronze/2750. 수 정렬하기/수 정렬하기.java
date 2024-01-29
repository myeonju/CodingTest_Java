import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] number = new int[N];

        for(int i=0; i<N; i++){
            number[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(number);

        for(int i=1; i<N; i++){
            if(number[i] != number[i-1]){
                System.out.println(number[i - 1]);
            }
        }
        System.out.println(number[N - 1]);
    }
}
