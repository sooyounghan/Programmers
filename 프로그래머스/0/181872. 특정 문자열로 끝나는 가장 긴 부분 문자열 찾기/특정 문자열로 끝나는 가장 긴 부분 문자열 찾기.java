class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int idx = 0;
        
        for(int i = 0; i < myString.length(); i++) {
            char ch_myString = myString.charAt(i);
            for(int j = 0; j < pat.length(); j++) {
                char ch_pat = pat.charAt(j);
                
                if(ch_myString == ch_pat) {
                    idx = i;
                }
            }
        }
        
        for(int i = 0; i <= idx; i++) {
            char ch = myString.charAt(i);
            answer += ch;
        }
        return answer;
    }
}