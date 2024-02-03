class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        char[] char_arr = my_string.toCharArray();
        
        while(s < e) {
            char temp = char_arr[s];
            char_arr[s] = char_arr[e];
            char_arr[e] = temp;
            
            s++;
            e--;
        }
        
        answer = new String(char_arr);
        
        return answer;
    }
}