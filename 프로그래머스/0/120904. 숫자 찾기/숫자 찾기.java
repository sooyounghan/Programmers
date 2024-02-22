class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String num_str = String.valueOf(num);
        
        for(int i = 0; i < num_str.length(); i++) {
            if((num_str.charAt(i) - '0') == k) {
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
}