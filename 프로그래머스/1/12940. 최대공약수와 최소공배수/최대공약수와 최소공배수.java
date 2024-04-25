class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
   
        if(n > m) {
            int temp = n;
            n = m;
            m = temp;
        }
        
        for(int i = n; i >= 2; i--) {
            if(m % i == 0 && n % i == 0) {
                answer[0] = i;
                break;
            }
        }
        
        if(answer[0] == 0) answer[0] = 1;
        answer[1] = answer[0] * (n / answer[0]) * (m / answer[0]);
        
        return answer;
    }
}