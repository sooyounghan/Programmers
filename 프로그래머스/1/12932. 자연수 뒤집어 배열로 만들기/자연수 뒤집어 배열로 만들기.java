import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = null;
        List<Integer> answer_temp = new ArrayList<Integer>();
        
        while(n > 0) {
            answer_temp.add((int)(n % 10));
            n /= 10;
        }
        
        answer = new int[answer_temp.size()];
        
        for(int i = 0; i < answer_temp.size(); i++) {
            answer[i] = answer_temp.get(i);
        }
        
        return answer;
    }
}