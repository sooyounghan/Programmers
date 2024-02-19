class Solution {
    public int solution(String s) {
        int answer = 0;
        int previous_num = 0;
        String temp = "";
        
        for(int i = 0; i < s.length(); i++) {      
            if((s.charAt(i) >= '0' && s.charAt(i) <= '9') || s.charAt(i) == '-') {
                temp += s.charAt(i);
                
                if(i == s.length() - 1) {
                    answer += Integer.parseInt(temp);
                    temp = "";
                    break;
                }
            }
            
            else if(s.charAt(i) == ' ') {
                if(temp.equals("")) continue;
                answer += Integer.parseInt(temp);
                previous_num = Integer.parseInt(temp);
                temp = "";
            }
            
            else if(s.charAt(i) == 'Z') {
                answer -= previous_num;
            }
        }
        
        return answer;
    }
}