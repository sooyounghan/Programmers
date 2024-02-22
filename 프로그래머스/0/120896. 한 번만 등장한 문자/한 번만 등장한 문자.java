class Solution {
    public String solution(String s) {
        char[] temp_s = s.toCharArray();
        int count = 1;
        String answer = "";
        
        for(int i = 0; i < temp_s.length - 1; i++) {
            for(int j = 0; j < temp_s.length - i - 1; j++) {
                if(temp_s[j] > temp_s[j + 1]) {
                    char temp = temp_s[j];
                    temp_s[j] = temp_s[j + 1];
                    temp_s[j + 1] = temp;
                }
            }
        }
        
        for(int i = 0; i <= temp_s.length - 1; i++) {
            if(i == temp_s.length - 1) {
                if(count == 1) answer += temp_s[i];
                break;
            }
            if(temp_s[i] == temp_s[i + 1]) count++;
            else {
                if(count == 1) answer += temp_s[i];
                count = 1;
            }
        }
        return answer;
    }
}