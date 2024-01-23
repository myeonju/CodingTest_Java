import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        
        int[] knownNumbers = new int[6];
        int knownCount = 0;
        for (int num : lottos) {
            if (num != 0) {
                knownNumbers[knownCount++] = num;
            }
        }

        int matchCount = 0;
        for (int i = 0; i < knownCount; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (knownNumbers[i] == win_nums[j]) {
                    matchCount++;
                    break;
                }
            }
        }

        int totalMatchCount = matchCount + (lottos.length - knownCount);
        answer[0] = getRank(totalMatchCount);

        answer[1] = getRank(matchCount);

        return answer;
    }

   
    private static int getRank(int matchCount) {
        switch (matchCount) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}