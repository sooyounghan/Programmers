class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] s_arr = s.toCharArray();
        
        for(int i = 0 ; i < s_arr.length; i++) {
            if(s_arr[i] >= 'A' && s_arr[i] <= 'Z') {
                if(s_arr[i] + n > 'Z') {
                    s_arr[i] = (char)(s_arr[i] + n - 26);
                }
                else {
                    s_arr[i] = (char)(s_arr[i] + n);
                }
            } else if(s_arr[i] >= 'a' && s_arr[i] <= 'z') {
                if(s_arr[i] + n > 'z') {
                    s_arr[i] = (char)(s_arr[i] + n - 26);
                }
                else {
                    s_arr[i] = (char)(s_arr[i] + n);
                }
            } else if(s_arr[i] == ' ') continue;
        }
        
        answer = String.valueOf(s_arr);
        return answer;
    }
}