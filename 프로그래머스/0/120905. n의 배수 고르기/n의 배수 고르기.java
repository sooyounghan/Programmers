import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = null;
        List<Integer> arr_numlist = new ArrayList<Integer>();
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) arr_numlist.add(numlist[i]);
        }
        
        answer = new int[arr_numlist.size()];
        for(int i = 0; i < arr_numlist.size(); i++) {
            answer[i] = arr_numlist.get(i);
        }
        
        return answer;
    }
}