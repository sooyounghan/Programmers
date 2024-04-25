import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = null;
        List<Integer> arr_list = new ArrayList<Integer>();
        
        arr_list.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(arr_list.contains(arr[i - 1]) && (arr[i] == arr[i - 1])) continue;
            else arr_list.add(arr[i]);
        }
        
        answer = new int[arr_list.size()];
        
        for(int i = 0; i < arr_list.size(); i++) {
            answer[i] = arr_list.get(i);
        }
        
        return answer;
    }
}