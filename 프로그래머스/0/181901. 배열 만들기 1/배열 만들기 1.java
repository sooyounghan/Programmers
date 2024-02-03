import java.util.Arrays;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int idx = 0;
        
        for(int i = 1; i <= n; i++) {
            if(i % k == 0) {
                answer[idx++] = i;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}