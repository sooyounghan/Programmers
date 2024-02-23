class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x = Integer.MIN_VALUE;
        int y = Integer.MIN_VALUE;
        
        for(int i = 0; i < dots.length; i++) {
            for(int j = i + 1 ; j < dots.length; j++) {
                if(Math.abs(dots[i][0] - dots[j][0]) > x) {
                    x = Math.abs(dots[i][0] - dots[j][0]);
                }
                if(Math.abs(dots[i][1] - dots[j][1]) > y) {
                    y = Math.abs(dots[i][1] - dots[j][1]);
                }
            }
        }
        
        answer = x * y;
        return answer;
    }
}