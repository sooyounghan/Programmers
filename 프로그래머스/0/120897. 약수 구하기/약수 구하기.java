import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> temp = new ArrayList<Integer>();
        int[] answer = {};
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) temp.add(i);
        }
        
        answer = new int[temp.size()];
        
        for(int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}