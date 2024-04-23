class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        char[] s_arr = s.toCharArray();
        
        if(s.length() == 4 || s.length() == 6) {
            for(int i = 0; i < s_arr.length; i++) {
                if(s_arr[i] >= '0' && s_arr[i] <= '9') answer = true;
                else {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}