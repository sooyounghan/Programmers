import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> result = new ArrayList<Integer>();
                
        for(int i = 0; i < intervals.length; i++) {
            int idx_a = intervals[i][0];
            int idx_b = intervals[i][1];
            
            for(int j = idx_a; j <= idx_b; j++) {
                result.add(arr[j]);
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}