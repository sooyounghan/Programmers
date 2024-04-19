class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        
        if(num == 1) {
            return answer;
        }
        
        while(num > 1 && count < 500) {
            if(num % 2 == 0) {
                num /= 2;
                count++;
            } else {
                num = (num * 3) + 1;
                count++;
            }
        }
        
        if(count == 500 || num < 1) answer = -1;
        else if(num == 1) answer = count;
        
        return answer;
    }
}