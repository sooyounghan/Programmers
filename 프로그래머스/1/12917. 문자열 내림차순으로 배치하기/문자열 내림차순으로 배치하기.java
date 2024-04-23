import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        List<Character> s_list = new ArrayList<Character>();
        
        for(int i = 0; i < s.length(); i++) {
            s_list.add(s.charAt(i));
        }
        
        Collections.sort(s_list, Collections.reverseOrder());
        
        for(int i = 0; i < s_list.size(); i++) {
            answer += s_list.get(i);
        }
        
        return answer;
    }
}