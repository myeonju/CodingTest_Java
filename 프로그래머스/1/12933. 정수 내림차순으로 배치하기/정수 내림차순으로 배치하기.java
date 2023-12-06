import java.util.*;

class Solution {
    public long solution(long n) {
        int length = Long.toString(n).length();
        char[] number = Long.toString(n).toCharArray();

        // 각 자리 숫자를 내림차순으로 정렬
        Arrays.sort(number);
        for (int i = 0; i < length / 2; i++) {
            char temp = number[i];
            number[i] = number[length - 1 - i];
            number[length - 1 - i] = temp;
        }

        return Long.parseLong(new String(number));
    }
}