import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int cnt = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
            if(temp.contains(arr[i])) continue;
            else {
            	temp.add(arr[i]);
            	cnt++;
            }
        }
        
        for(int i = 0; i < temp.size() && i < k; i++) {
            answer[i] = temp.get(i);
        }
        
        if(cnt < k) {
        	for(int i = cnt; i < k; i++) {
        		answer[i] = -1;
        	}
        }
        return answer;
    }
}
