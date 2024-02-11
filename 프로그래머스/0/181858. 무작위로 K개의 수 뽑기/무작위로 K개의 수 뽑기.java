import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int count = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
            if(temp.size() == 0) {
                temp.add(arr[i]);
                count++;
                continue;
            }
            
            if(arr[i] != arr[i-1]) {
            	if(temp.contains(arr[i])) continue;
            	else {
            		temp.add(arr[i]);
            		count++;
            	}
            }
        }
        
        for(int i = 0; i < temp.size() && i < k; i++) {
            answer[i] = temp.get(i);
        }
        
        if(count < k) {
        	for(int i = count; i < k; i++) {
        		answer[i] = -1;
        	}
        }
        return answer;
    }
}