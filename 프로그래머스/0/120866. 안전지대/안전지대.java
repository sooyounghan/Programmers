class Solution {
    public int solution(int[][] board) {
    	boolean[][] bomb_area = new boolean[board.length][board[0].length];
        int answer = 0;
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    for(int k = i - 1; k <= i + 1; k++) {
                        for(int m = j - 1; m <= j + 1; m++) {
                        	if((k < 0 || k > board.length - 1) || (m < 0 || m > board.length - 1)) continue; 
                        		bomb_area[k][m] = true;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(!bomb_area[i][j]) {
                    answer++;
                }
            }
        }
        return answer;
    }
}