class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = null;
        int row_length = arr.length;
        int col_length = arr[0].length;
        
        if(row_length < col_length) {
            answer = new int[col_length][col_length];   
        }
        else if(row_length > col_length) {
            answer = new int[row_length][row_length];
        }
        else {
            answer = new int[row_length][col_length];
        }
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}