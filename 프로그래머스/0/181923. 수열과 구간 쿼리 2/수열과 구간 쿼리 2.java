class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++) {
            int min = Integer.MAX_VALUE;
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for(int j = s; j <= e; j++) {
                if(arr[j] > k) {
                	min = Math.min(arr[j], min);
                }
            }
            if(min == Integer.MAX_VALUE) answer[i] = -1;
            else answer[i] = min;
        }
        return answer;
    }
}