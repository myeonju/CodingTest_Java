class Solution {
    public int solution(String word) {
        int[] weights = {781, 156, 31, 6, 1}; 
        char[] letters = {'A', 'E', 'I', 'O', 'U'};
        int answer = word.length();
        
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < 5; j++) { 
                if (word.charAt(i) == letters[j]) {
                    answer += weights[i] * j; 
                    break;
                }
            }
        }
        
        return answer;
    }
}