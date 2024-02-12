class Solution {
    public String solution(String n_str) {
        String answer = "";
        int num = 0;
        
        for(int i = 0; i < n_str.length(); i++) {
            int temp = n_str.charAt(i) - '0';
        
            if(temp == 0) {
                if(i != n_str.length() - 1 && num > 0) num *= 10;
                else continue;
            }
            
            else {
                num += temp;
                if(i != n_str.length() - 1) num *= 10;
                else continue;
            }
        }
        
        answer = String.valueOf(num);
        return answer;
    }
}