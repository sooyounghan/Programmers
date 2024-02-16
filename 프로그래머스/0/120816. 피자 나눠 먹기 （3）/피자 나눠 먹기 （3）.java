class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int pizza = 1;
        
        while((pizza * slice) / n != 1) {
            if(n == 1) {
                answer = 1;
                return answer;
            }
            
            else {
                pizza++;
            } 
        }  
        answer = pizza;
        return answer;
    }
}