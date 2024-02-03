import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int i = 0;
        while(i < arr.length) {
           if(temp.size() == 0) {
               temp.add(arr[i]);
               i++;
           }
           else {
               if(temp.get(temp.size()-1) < arr[i]) {
                   temp.add(arr[i]);
                   i++;
               }
               else {
                   temp.remove(temp.size()-1);
               }
           }
        }
        
        stk = new int[temp.size()];
        for(int j = 0; j < stk.length; j++) {
            stk[j] = temp.get(j);
        }
        return stk;
    }
}