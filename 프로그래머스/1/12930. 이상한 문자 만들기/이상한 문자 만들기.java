class Solution {
    public String solution(String s) {
        String answer = "";
        String[] s_split = s.split(" ", -1);
        
        for(int i = 0; i < s_split.length; i++) {      
            char[] s_split_char = s_split[i].toCharArray();
            
            for(int j = 0; j < s_split_char.length; j++) {
                if(j % 2 == 0) {
                    if(s_split_char[j] >= 'a' && s_split_char[j] <= 'z') 
                        s_split_char[j] = (char)(s_split_char[j] - 32);
                }
                else {
                    if(s_split_char[j] >= 'A' && s_split_char[j] <= 'Z') 
                        s_split_char[j] = (char)(s_split_char[j] + 32);
                }
            }
            
            if(i != s_split.length - 1)
                answer += String.valueOf(s_split_char) + " ";
            else 
                answer += String.valueOf(s_split_char);
        }
        
        return answer;
    }
}