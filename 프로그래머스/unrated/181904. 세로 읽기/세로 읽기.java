public class Solution {
    public static String solution(String myString, int m, int c) {
        StringBuilder result = new StringBuilder();

        for (int i = c - 1; i < myString.length(); i += m) {
            result.append(myString.charAt(i));
        }

        return result.toString();
    }
}