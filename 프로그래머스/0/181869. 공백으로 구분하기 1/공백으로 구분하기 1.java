class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        int count = 1;
        
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) == ' ') 
                count++;
        }

        answer = new String[count];
        if(count == 1) {
            answer[0] = my_string;
        }
        
        else {
            for(int i = 0, idx = 0, j = 0; i < my_string.length(); i++) {
                if(my_string.charAt(i) == ' ') {
                   answer[j++] = my_string.substring(idx, i);
                   idx = i + 1; 
                }
                
                if(i == my_string.length() - 1) {
                    answer[j++] = my_string.substring(idx, my_string.length());  
                }
            }
        }
        
        return answer;
    }
}