class Solution {
    public int solution(String s) {
        int count = 0;
        int index = 0;
        while (index < s.length()) {
            char x = s.charAt(index);
            int xCount = 0;
            int otherCount = 0;
            int i = index;
            while (i < s.length()) {
                if (s.charAt(i) == x) {
                    xCount++;
                } else {
                    otherCount++;
                }
                if (xCount == otherCount) {
                    count++;
                    index = i + 1;
                    break;
                }
                i++;
            }
            if (i == s.length()) {
                count++;
                break;
            }
        }
        return count;
    }
}