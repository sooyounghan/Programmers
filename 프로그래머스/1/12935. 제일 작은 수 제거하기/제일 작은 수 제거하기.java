import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = null;
        int min = Integer.MAX_VALUE;
        List<Integer> arr_list = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) min = arr[i];
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(!(min == arr[i])) {
                arr_list.add(arr[i]);
            }
        }
        
        if(arr_list.size() == 0) {
            answer = new int[]{-1};
        } else {
            answer = new int[arr_list.size()];
            for(int i = 0 ; i < arr_list.size(); i++) {
                answer[i] = arr_list.get(i);
            }
        }
        
        return answer;
    }
}