class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        for(int i = (Math.max(sides[0], sides[1]) - Math.min(sides[0], sides[1])) + 1; i < sides[0] + sides[1]; i++) {
            if(Math.max(sides[0], sides[1]) < Math.min(sides[0], sides[1]) + i) {
                answer++;
                continue;
            }
            else if(i < sides[0] + sides[1]) {
                answer++;
                continue;
            }
        }
        return answer;
    }
}