import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int side1 = scanner.nextInt();
            int side2 = scanner.nextInt();
            int side3 = scanner.nextInt();

            if (side1 == 0 && side2 == 0 && side3 == 0) {
                break;
            }
            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                if (side1 == side2 && side1 == side3) {
                    System.out.println("Equilateral");
                } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }

        }

    }
}
