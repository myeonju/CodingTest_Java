class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int c1 = 0;
        int c2 = 0;
        
        int i = 0;
        while(i < goal.length) {
        	if (c1 < cards1.length && goal[i].equals(cards1[c1])) {
        		c1++;
        	} else if (c2 < cards2.length && goal[i].equals(cards2[c2])) {
        		c2++;
        	} else {
        		answer = "No";
        		break;
        	}
        	i++;
        }
        
        return answer;
    }
}