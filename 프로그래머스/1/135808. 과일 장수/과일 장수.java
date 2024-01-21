import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Integer[] sortscore = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(sortscore, Collections.reverseOrder());

        int answer = 0;
        for (int i = 0; i < sortscore.length; i += m) {
            if (i + m > sortscore.length) break;
            int minScore = sortscore[i];
            for (int j = i; j < i + m; j++) {
                minScore = Math.min(minScore, sortscore[j]);
            }
            answer += minScore * m;
        }

        return answer;
    }
}