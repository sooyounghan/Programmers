class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], Math.max(sides[1], sides[2]));
        
        if((sides[0] + sides[1] + sides[2]) > (2 * max)) answer = 1;
        else answer = 2;
        
        return answer;
    }
}