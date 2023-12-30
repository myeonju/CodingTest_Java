class Solution {
    boolean solution(String s) {
        int p=0;
        int y=0;
        
        for(char c: s.toCharArray()){
            switch (c) {
                    case 'p', 'P' -> p++;
                    case 'y', 'Y' -> y++;
            }
        }
        return p == y;
        
    }
}