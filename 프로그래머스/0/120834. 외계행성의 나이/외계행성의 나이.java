class Solution {
    public String solution(int age) {
        String answer = "";
        
        String temp = String.valueOf(age);
        
        for(int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            answer += (char)(ch - '0' + 'a');
        }
        return answer;
    }
}