import java.util.*;

class Solution {
    public String solution(int[] numbers) {
      
        String[] numberStr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numberStr[i] = String.valueOf(numbers[i]);
        }

        // 문자열을 조합하여 가장 큰 수를 만들 수 있도록 정렬
        Arrays.sort(numberStr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2 + s1).compareTo(s1 + s2);
            }
        });

        // 배열을 문자열로 합치기
        StringBuilder answerBuilder = new StringBuilder();
        for (String str : numberStr) {
            answerBuilder.append(str);
        }

        if (answerBuilder.charAt(0) == '0') {
            return "0";
        }

        return answerBuilder.toString();
    }
}