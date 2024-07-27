import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[8];

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        String result = "mixed";

        boolean isAscending = true;
        for(int i=0; i<num.length; i++){
            if(num[i]!= i+1){
                isAscending = false;
                break;
            }
        }

        boolean isDescending  = true;
        for(int i=0; i<num.length; i++){
            if(num[i]!= 8-i){
                isDescending  = false;
                break;
            }
        }

        if(isAscending){
            result = "ascending";
        } else if (isDescending) {
            result = "descending";
        }
        
        System.out.println(result);
    }
}
