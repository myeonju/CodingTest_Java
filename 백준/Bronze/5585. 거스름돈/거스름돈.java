import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();

        int change = 1000 - price;
        int count = 0;

        count += change / 500;
        change = change % 500;

        count += change / 100;
        change = change % 100;

        count += change / 50;
        change = change % 50;

        count += change / 10;
        change = change % 10;

        count += change / 5;
        change = change % 5;

        count += change / 1;
        System.out.println(count);

    }
}
