class Solution {
    public long solution(long n) {
        long answer = -1;
        
        long x = (long)(Math.sqrt(n));
        
        if(Math.pow(x, 2) == n)
            answer = (long)(Math.pow(x + 1, 2));
    
        return answer;
    }
}