class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            answer++;
            if(answer % 3 == 0) answer++;
            String answer_str = String.valueOf(answer);
            
            while(answer_str.contains("3")) {
              answer++;  
              if(answer % 3 == 0) answer++;
              answer_str = String.valueOf(answer);
            } 
        }
        return answer;
    }
}