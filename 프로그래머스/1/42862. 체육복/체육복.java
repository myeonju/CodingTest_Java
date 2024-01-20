import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n];
        Arrays.fill(clothes,1);
        
        for(int l:lost){
            clothes[l-1]--;
        }
        
        for(int r:reserve){
            clothes[r-1]++;
        }
        
        for (int i = 0; i < n; i++) {
            if (clothes[i] == 0) {
                if (i - 1 >= 0 && clothes[i - 1] == 2) {
                    clothes[i - 1]--;
                    clothes[i]++;
                } else if (i + 1 < n && clothes[i + 1] == 2) {
                    clothes[i + 1]--;
                    clothes[i]++;
                }
            }
        }
        
        int cnt=0;
        for(int c: clothes){
            if(c>0){
                cnt++;
            }
        }
        
        return cnt;
    }
}