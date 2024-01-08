import java.util.*;

class Solution {
    private boolean isValid(int[] citations, int h){
        int count = 0;
        for(int citation: citations){
            if(citation>=h) count++;
        }
        return count>=h;
    }
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int length = citations.length;
        for(int h = length; h>=0; h--){
            if(isValid(citations,h)) return h;
        }

        return 0;
    }
}