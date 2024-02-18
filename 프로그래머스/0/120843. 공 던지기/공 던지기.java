class Solution {
    public int solution(int[] numbers, int k) {
        int idx = ((2 * k) - 1) - 1;
        if(idx >= numbers.length) idx %= numbers.length; 
        int answer = numbers[idx];
        
        return answer;
    }
}