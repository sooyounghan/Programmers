import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> num_arr = new ArrayList<Integer>();
        int[] answer = new int[numlist.length];
        int count = 0;
        int min = Integer.MAX_VALUE;
        int value = 0;
        
        Arrays.sort(numlist);
        
        while(count < numlist.length) {
            min = Integer.MAX_VALUE;
            for(int i = 0; i < numlist.length; i++) {
                if(!(num_arr.contains(numlist[i]))) {
                    if(Math.abs(n - numlist[i]) <= min) {
                        min = Math.abs(n - numlist[i]);
                        value = numlist[i];
                    }
                }
            }
            
            if(!(num_arr.contains(value))) {
                num_arr.add(value);
                count++;
            }
        }
        
        for(int i = 0; i < num_arr.size(); i++) {
            answer[i] = num_arr.get(i);
        }
        return answer;
    }
}