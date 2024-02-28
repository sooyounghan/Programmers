class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int m = i; m <= j; m++){
            int x = m;
            while(true) {
                if(x % 10 == k) answer++;
                x /= 10;
                
                if(x == 0) break;
            }
        }
        return answer;
    }
}