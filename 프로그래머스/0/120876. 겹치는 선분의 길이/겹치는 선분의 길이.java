class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] count = new int[201];
        
        for(int i = 0; i < lines.length; i++) {
            int start = lines[i][0] + 100;
            int end = lines[i][1] + 100;
            
            for(int j = start; j < end; j++) {
                count[j]++;
            }
        }
        
        for(int i = 0; i < count.length; i++) {
            if(count[i] > 1) answer++;
        }
        
        return answer;
    }
}