class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        int count = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            char ch_my_string = my_string.charAt(i);
            
            for(int j = count; j < target.length(); j++) {
                char ch_target = target.charAt(j);
                
                if(ch_my_string == ch_target) {
                    count++;
                    break;
                }
            }
            
            if(count == target.length()) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}