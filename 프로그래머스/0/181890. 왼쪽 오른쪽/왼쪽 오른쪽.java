class Solution {
    public String[] solution(String[] str_list) {
        int start_index = 0;
        int end_index = 0;
        for(int i = 0; i < str_list.length; i++) {
            char ch = str_list[i].charAt(0);
            if(ch == 'l') {
                start_index = 0;
                end_index = i;
                break;
            }
            
            else if(ch == 'r') {
                start_index = i + 1;
                end_index = str_list.length;
                break;
            }
        }
        
        String[] answer = new String[end_index - start_index];
        
        for(int i = start_index; i < end_index; i++) {
            answer[i - start_index] = str_list[i];
        }
        
        return answer;
    }
}