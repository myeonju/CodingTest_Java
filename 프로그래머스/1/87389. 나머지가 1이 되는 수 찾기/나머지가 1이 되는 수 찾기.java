class Solution {
    public int solution(int n) {
        int min=Integer.MAX_VALUE;
        
      for(int x=2; x<=n; x++){
          if(n%x==1){
              min=Math.min(min,x);
          }
      } 
        return min;
    }
}