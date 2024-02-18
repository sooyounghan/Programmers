class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; ;i++) {
            if(n == factorial(i)) {
                answer = i;
                break;
            }
            else if(n < factorial(i)) {
                answer = i - 1;
                break;
            }
        }
        return answer;
    }
    
    public int factorial(int n) {
        if(n == 1) return 1;
        
        return n * factorial(n - 1);
    }
}