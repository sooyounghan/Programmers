import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
            if(temp.size() == 0) {
                temp.add(arr[i]);
                continue;
            }
            
            if(arr[i] == temp.get(temp.size() - 1)) {
                temp.remove(temp.size() - 1);
            }
            else {
                temp.add(arr[i]);
            }
        }
        
        if(temp.size() == 0) answer = new int[]{-1};
        else {
            answer = new int[temp.size()];
            for(int i = 0; i < temp.size(); i++) {
                answer[i] = temp.get(i);
            }
        }
        
        return answer;
    }
}