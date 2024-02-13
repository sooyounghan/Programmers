import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
            temp.add(arr[i]);
        }
            
        for(int i = 0; i < delete_list.length; i++) {
            if(temp.contains(delete_list[i])) {
                temp.remove((Integer)delete_list[i]);
            }
        }
        
        answer = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}