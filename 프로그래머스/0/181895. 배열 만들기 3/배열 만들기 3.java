class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int sum_index = 0;  
        int idx = 0;
        
        for(int i = 0; i < intervals.length; i++) {
            sum_index += intervals[i][1] - intervals[i][0] + 1;
        }
        
        int[] answer = new int[sum_index];
        
        for(int i = 0; i < intervals.length; i++) {
            int idx_a = intervals[i][0];
            int idx_b = intervals[i][1];
            
            for(int j = idx_a; j <= idx_b ; j++) {
                answer[idx++] = arr[j];
            }
        }
        return answer;
    }
}