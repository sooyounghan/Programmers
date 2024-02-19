import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> temp = new ArrayList<Integer>();
        int[] answer = null;
        
        for(int i = 2; i <= n; i++) {
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) count++;
            }
            if(count == 2 && n % i == 0) temp.add(i);
        }
        
        answer = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}