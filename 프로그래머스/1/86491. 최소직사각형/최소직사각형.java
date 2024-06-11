class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int row_max = 0;
        int col_max = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            
            row_max = Math.max(row_max, sizes[i][0]);
            col_max = Math.max(col_max, sizes[i][1]);
        }
        return answer = row_max * col_max;
    }
}