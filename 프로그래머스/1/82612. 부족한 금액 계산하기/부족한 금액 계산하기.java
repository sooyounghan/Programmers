class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        
        for(int i = count; i > 0; i--) {
            total += (long)price * i;    
        }
        
        if(total > money) answer = total - money;

        return answer;
    }
}