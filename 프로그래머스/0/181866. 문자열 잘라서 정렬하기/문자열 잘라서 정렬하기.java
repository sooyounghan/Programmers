import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        String temp = "";
        int count = 0;
        
        for(int i = 0; i < myString.length(); i++) {
            if(i == myString.length() - 1) {
                if(myString.charAt(i) == 'x') break;
                else {
                    count++;
                    break;
                }
            }
            
            char ch = myString.charAt(i);
            if(ch == 'x') {
                if(ch == myString.charAt(i + 1)) continue;
            }
            else {
                if(myString.charAt(i + 1) == 'x') {
                    count++;	
            	}
            }
        }

        answer = new String[count];
        
        for(int i = 0, j = 0; i < myString.length(); i++) {
            if(i == myString.length() - 1) {
                if(myString.charAt(i) == 'x') break;
                else {
                    temp += myString.charAt(i);
                    answer[j] = temp;
                    temp = "";
                    break;
                }
            }
            
            char ch = myString.charAt(i);
            
            if(ch == 'x') {
                if(ch == myString.charAt(i + 1)) continue;
            }
            else {
                if(myString.charAt(i+1) == 'x') {
                    temp += myString.charAt(i);
                    answer[j++] = temp;
                    temp = "";
                }
                else {
                	temp += myString.charAt(i);
                }
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}