import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        boolean[] arr_delete_check = new boolean[arr.length];
        int count = 0;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    arr_delete_check[i] = true;
                    count++;
                }
            }
        }
        
        answer = new int[arr.length - count];
        for(int i = 0, j = 0; i < arr.length; i++) {
            if(!arr_delete_check[i]) {
                answer[j++] = arr[i];
            }
        }
        
        return answer;
    }
}