class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = null;
    
        if(my_str.length() % n == 0) 
            answer = new String[my_str.length() / n];
        else 
            answer = new String[(my_str.length() / n) + 1];

        for(int i = 0; i < answer.length; i++) {
            if(i == answer.length - 1) {
                answer[i] = my_str.substring((i * n), my_str.length());
            }
            
            else answer[i] = my_str.substring((i * n), (i + 1) * n);
        }
    
        return answer;
    }
}