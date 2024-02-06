class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            
            if(ch >= 'A' && ch <= 'Z') {
                ch += 32;
                answer += ch;
            }
            else answer += ch;
        }
        return answer;
    }
}