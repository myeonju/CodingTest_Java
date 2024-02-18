import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] coordinate1 = {scanner.nextInt(), scanner.nextInt()};
       int[] coordinate2 = {scanner.nextInt(), scanner.nextInt()};
       int[] coordinate3 = {scanner.nextInt(), scanner.nextInt()};

       int x;
       int y;

       if(coordinate1[0] == coordinate2[0]){
           x = coordinate3[0];
       } else if (coordinate1[0] == coordinate3[0]) {
           x = coordinate2[0];
       } else {
           x = coordinate1[0];
       }

        if(coordinate1[1] == coordinate2[1]){
            y = coordinate3[1];
        } else if (coordinate1[1] == coordinate3[1]) {
            y = coordinate2[1];
        } else {
            y = coordinate1[1];
        }

        System.out.println(x + " " + y);

    }
}