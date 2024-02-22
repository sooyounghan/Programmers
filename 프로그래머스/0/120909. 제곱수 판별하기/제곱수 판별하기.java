class Solution {
    public int solution(int n) {
        int answer = 2;
        int num = 1;
        
        while(num * num <= n) {
            if(num * num == n) {
                answer = 1;
                break;
            }
            num++;
        }
        
        return answer;
    }
}