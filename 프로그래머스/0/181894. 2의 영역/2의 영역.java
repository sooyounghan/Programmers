import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> isTwo = new ArrayList<Integer>();
        int min_idx_two = Integer.MAX_VALUE;
        int max_idx_two = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) isTwo.add(i);
        }
        
        if(isTwo.size() == 0) {
            int[] answer = new int[]{-1};
            return answer;
        }
        
        else {
            for(int i = 0; i < isTwo.size(); i++) {
                min_idx_two = Math.min(min_idx_two, isTwo.get(i));
                max_idx_two = Math.max(max_idx_two, isTwo.get(i));
            }
            
            int[] answer = new int[max_idx_two - min_idx_two + 1];
            
            for(int i = 0; i < max_idx_two - min_idx_two + 1; i++) {
                answer[i] = arr[min_idx_two + i];
            }        
            return answer;
        }
    }
}