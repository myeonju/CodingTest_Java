class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length() / 2;

        if (s.length() % 2 == 0) {
            answer = s.substring(length - 1, length + 1);
        } else {
            answer = Character.toString(s.charAt(length));
        }

        return answer;
    }
}