import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sides = new int[3];

        for (int i = 0; i < 3; i++) {
            sides[i] = scanner.nextInt();
        }

        Arrays.sort(sides);

        int maxPerimeter = 0;

        if (sides[0] + sides[1] > sides[2]) {
            maxPerimeter = sides[0] + sides[1] + sides[2];
        } else {
            maxPerimeter = (sides[0] + sides[1]) * 2 - 1;
        }

        System.out.println(maxPerimeter);
    }
}
