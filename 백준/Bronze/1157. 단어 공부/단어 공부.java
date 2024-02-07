import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toUpperCase(); 

        int[] count = new int[26]; 

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                count[c - 'A']++;
            }
        }

        int maxCount = 0; 
        char maxChar = '?';

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) { 
                maxCount = count[i];
                maxChar = (char) ('A' + i);
            } else if (count[i] == maxCount) { 
                maxChar = '?';
            }
        }

        System.out.println(maxChar);
    }
}