class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            for(int j = s; j <= e; j++) {
                arr[j]++;
            }
        }
        
        answer = arr;
        
        return answer;
    }
}