class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        for(int i = 0; i < num_str.length(); i++) {
            int num = num_str.charAt(i) - '0';
            answer += num;
        }
        return answer;
    }
}