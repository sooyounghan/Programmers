class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] temp_arr = new char[my_string.length()];
        
        for(int i = 0; i < temp_arr.length; i++) {
            temp_arr[i] = my_string.charAt(i);
        }
        
        int start = 0;
        int end = temp_arr.length - 1;
        
        while(start < end) {
            char temp = temp_arr[start];
            temp_arr[start] = temp_arr[end];
            temp_arr[end] = temp;
            
            start++;
            end--;
        }
        
        answer = new String(temp_arr);
        return answer;
    }
}