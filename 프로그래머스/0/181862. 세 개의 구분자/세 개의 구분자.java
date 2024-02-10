class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        String temp = "";
        int count = 0;
        
        for(int i = 0; i < myStr.length(); i++) {
           	if(i == myStr.length() - 1) {
                if(myStr.charAt(i) == 'a') break;
                else if(myStr.charAt(i) == 'b') break;
                else if(myStr.charAt(i) == 'c') break;
                else {
                	count++;
                	break;
                }
        	}

            char ch = myStr.charAt(i);
            
            if(ch == 'a' || ch == 'b' || ch == 'c') {
                if(myStr.charAt(i + 1) == 'a') continue;
                else if(myStr.charAt(i + 1) == 'b') continue;
                else if(myStr.charAt(i + 1) == 'c') continue;
                
            }
            else {
                if(myStr.charAt(i + 1) == 'a') count++;
                else if(myStr.charAt(i + 1) == 'b') count++;
                else if(myStr.charAt(i + 1) == 'c') count++;
            }
        }
        
        if(count == 0) {
            answer = new String[]{"EMPTY"};
            return answer;
        }
        else answer = new String[count];
        
        for(int i = 0, j = 0; i < myStr.length(); i++) {
           	if(i == myStr.length() - 1) {
                if(myStr.charAt(i) == 'a') {
                    answer[j++] = temp;
                    temp = "";
                    break;
                }
                else if(myStr.charAt(i) == 'b') {
                    answer[j++] = temp;
                    temp = "";
                    break;
                }
                else if(myStr.charAt(i) == 'c') {
                    answer[j++] = temp;
                    temp = "";
                    break;
                }
                else {
                	temp += myStr.charAt(i);
                    answer[j++] = temp;
                    temp = "";
                	break;
                }
        	}

            char ch = myStr.charAt(i);
            
            if(ch == 'a' || ch == 'b' || ch == 'c') {
                if(myStr.charAt(i + 1) == 'a') continue;
                else if(myStr.charAt(i + 1) == 'b') continue;
                else if(myStr.charAt(i + 1) == 'c') continue;
            }
            else {
                if(myStr.charAt(i + 1) == 'a') {
                    temp += myStr.charAt(i);
                    answer[j++] = temp;
                    temp = "";
                }
                else if(myStr.charAt(i + 1) == 'b') {
                    temp += myStr.charAt(i);
                    answer[j++] = temp;
                    temp = "";
                }
                else if(myStr.charAt(i + 1) == 'c') {
                    temp += myStr.charAt(i);
                    answer[j++] = temp;
                    temp = "";
                }
                else {
                    temp += myStr.charAt(i);
                }
            }
        }
        return answer;
    }
}