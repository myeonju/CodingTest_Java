import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        scanner.close();

        int count=0;
        boolean isWordStart = true;

        for(int i=0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                if(isWordStart){
                    isWordStart=false;
                    count++;
                }
            } else{
                isWordStart=true;
            }
        }
        System.out.println(count);
    }
}