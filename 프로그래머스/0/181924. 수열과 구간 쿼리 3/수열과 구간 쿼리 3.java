class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int i = 0; i < queries.length; i++) {
            int start_index = queries[i][0];
            int end_index = queries[i][1];
            
            int temp = arr[start_index];
            arr[start_index] = arr[end_index];
            arr[end_index] = temp;
        }
        
        answer = arr;
        
        return answer;
    }
}