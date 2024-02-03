class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        String[] temp = new String[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++) {
            temp[i] = my_string.substring(i, my_string.length());
        }
        
        for(int i = 0 ; i < temp.length; i++) {
            if(temp[i].equals(is_suffix)) {
                answer = 1;
                break;
            }
            else answer = 0;
        }
        
        return answer;
    }
}