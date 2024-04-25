import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> n_3 = new ArrayList<Integer>();
        
        while(n > 0) {
            n_3.add(n % 3);
            n /= 3;
        }
        
        for(int i = n_3.size() - 1, j = 0; i >= 0; i--) {
            answer += n_3.get(i) * (int)(Math.pow(3, j++));
        }
        
        return answer;
    }
}