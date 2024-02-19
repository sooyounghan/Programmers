import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<Character> temp = new ArrayList<Character>();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(!temp.contains(my_string.charAt(i))) {
                temp.add(my_string.charAt(i));
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}