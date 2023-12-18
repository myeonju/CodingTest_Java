class Solution {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                answer.append(s.charAt(i));
                i++;
            } else{
                String word = s.substring(i,i+3);
                switch(word){
                    case "zer":
                        answer.append(0);
                        i+=4;
                        break;
                    case "one":
                        answer.append(1);
                        i+=3;
                        break;
                    case "two":
                        answer.append(2);
                        i+=3;
                        break;
                    case "thr":
                        answer.append(3);
                        i+=5;
                        break;
                    case "fou":
                        answer.append(4);
                        i+=4;
                        break;
                    case "fiv":
                        answer.append(5);
                        i+=4;
                        break;
                    case "six":
                        answer.append(6);
                        i+=3;
                        break;
                    case "sev":
                        answer.append(7);
                        i+=5;
                        break;
                    case "eig":
                        answer.append(8);
                        i+=5;
                        break;
                    case "nin":
                        answer.append(9);
                        i+=4;
                        break;
                }
            }
        }
        return Integer.parseInt(answer.toString());
    }
}