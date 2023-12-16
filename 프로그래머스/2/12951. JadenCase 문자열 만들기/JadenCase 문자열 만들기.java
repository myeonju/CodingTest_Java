class Solution {
    public String solution(String s) {
    String answer = "";
    String[] words = s.toLowerCase().split("");
    boolean isfrist = true;

    for (String word: words) {
        answer += isfrist ? word.toUpperCase() : word;
        isfrist = word.equals(" ");
    }

    return answer;
    }
}