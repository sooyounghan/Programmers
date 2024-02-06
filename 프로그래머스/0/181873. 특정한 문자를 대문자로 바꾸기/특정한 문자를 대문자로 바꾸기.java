class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            char alphabet = alp.charAt(0);
            if(ch == alphabet) {
                ch -= 32;
                answer += ch;
            }
            
            else answer += ch;
        }
        return answer;
    }
}