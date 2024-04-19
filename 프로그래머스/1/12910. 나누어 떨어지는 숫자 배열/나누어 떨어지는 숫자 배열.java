import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = null;
        List<Integer> answer_list = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer_list.add(arr[i]);
            }
        }
        
        Collections.sort(answer_list);
        
        if(answer_list.size() > 0) {
            answer = new int[answer_list.size()];
                    
            for(int i = 0; i < answer.length; i++) {
                answer[i] = answer_list.get(i);
            }
        } else {
            answer = new int[]{-1};
        }    
        return answer;
    }
}