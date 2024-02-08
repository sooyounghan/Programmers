import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        String temp = "";
        ArrayList<String> x = new ArrayList<String>();
        
        for(int i = 0, idx = 0; i < my_string.length(); i++) {
            if(i == my_string.length() - 1) {
            	if(my_string.charAt(i) != ' ') {
            		temp = my_string.substring(idx, my_string.length());
            		x.add(temp); 
            		break;
            	}
            	
            	else break;
            }
            
            char ch = my_string.charAt(i);
            if(ch == ' ') {
                if(ch == my_string.charAt(i + 1)) {
                    continue;
                }            
                
                else {
                    idx = i + 1;
                }
            }
             
            else {
                if(my_string.charAt(i + 1) == ' ') {
                    temp = my_string.substring(idx, i + 1);
                    x.add(temp);
                }
                else {
                	continue;
                }
            }
        }
        
        answer = new String[x.size()];
        for(int i = 0; i < x.size(); i++) {
            answer[i] = x.get(i);
        }
        return answer;
    }
}