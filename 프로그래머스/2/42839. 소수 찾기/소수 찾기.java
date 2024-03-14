import java.util.*;

class Solution {
    
   HashSet<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        permutation("", numbers);
        return countPrimes();
    }

    private void permutation(String num, String numbers) {
        
        int n = numbers.length();
        
        if (!num.equals("")) {
            set.add(Integer.valueOf(num));
        }
        
        for (int i = 0; i < n; i++) {
            permutation(num + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i+1, n));
        }
    }

    private int countPrimes() {
        int count = 0;
        
        for (int number : set) {
            if (isPrime(number)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
       
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
