class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        for(int i = 1; ;i++) {
            if(n == 1) {
                answer = 1;
                return answer;
            }
            
            else if((i * slice) / n == 1){
                answer = i;
                return answer;
            } 
            
            else continue;
        }        
    }
}