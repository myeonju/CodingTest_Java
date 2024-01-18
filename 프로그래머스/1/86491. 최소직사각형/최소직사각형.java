class Solution {
    public int solution(int[][] sizes) {
        int maxW = Integer.MIN_VALUE;
        int maxH = Integer.MIN_VALUE;
        
        for(int i=0; i<sizes.length; i++){
            int w = sizes[i][0];
            int h = sizes[i][1];
            
            if(w<h){
                int temp = w;
                w = h;
                h = temp;
            }
            
            maxW = Math.max(maxW, w);
            maxH = Math.max(maxH, h);
            
        }
        return maxW * maxH;
    }
}