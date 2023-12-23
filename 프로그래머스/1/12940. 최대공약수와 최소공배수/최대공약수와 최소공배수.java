class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int a=n;
        int b=m;
        
        while(b!=0){
            int temp = a%b;
            a=b;
            b=temp;
        }
        
        int gcd=a;
        
        int lcm = (n*m)/gcd;
        
        answer[0]=gcd;
        answer[1]=lcm;
        
        return answer;
    }
}