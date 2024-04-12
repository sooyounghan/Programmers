class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int p_check = 0;
        int y_check = 0;
        String s_lower = s.toLowerCase();
        
        for(int i = 0; i < s_lower.length(); i++) {
            if(s_lower.charAt(i) == 'p') p_check++;
            else if(s_lower.charAt(i) == 'y') y_check++;
        }
        
        if(p_check == y_check) answer = true;
        else answer = false; 
        
        return answer;
    }
}