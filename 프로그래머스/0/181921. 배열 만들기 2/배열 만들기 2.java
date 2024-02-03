import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
    	int[] answer;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = l; i <= r; i++) {
            String num = "";
            int cnt = 0;
            num = String.valueOf(i);
            int num_length = num.length();
            for(int j = 0; j < num.length(); j++) {
                if(num.charAt(j) == '5' || num.charAt(j) == '0') {
                    cnt++;
                }
            }
            if(cnt == num_length) {
            	arr.add(i);
            }
        }
        
        if(arr.size() == 0) {
        	answer = new int[] {-1};
        	return answer;
        }
        else {
        	answer = new int[arr.size()];
            for(int i = 0; i < arr.size(); i++) {
            	answer[i] = arr.get(i);
            }
        }
        return answer;
    }
}