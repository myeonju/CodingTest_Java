import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n];
        Arrays.fill(student,1);
        
        for(int l:lost){
            student[l-1]--;
        }
        
        for(int r:reserve){
            student[r-1]++;
        }
        
        for(int i=0; i<n; i++){
            if(student[i]==0){
                if(i-1>=0 && student[i-1]==2){
                    student[i-1]--;
                    student[i]++;
                } else if(i+1<n &&student[i+1]==2){
                    student[i+1]--;
                    student[i]++;
                }
            }
        }
        
        int cnt=0;
        for(int s:student){
            if(s>0){
                cnt++;
            }
        }
        
        return cnt;
    }
}