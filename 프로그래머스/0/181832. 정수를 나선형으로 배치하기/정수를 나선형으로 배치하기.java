class Solution {
    public int[][] solution(int n) {
    	int[][] answer = new int[n][n];
        int x = 0;
        int y = 0;
        int num = 1;
        int direction = 0;
        
        while(num != Math.pow(n, 2)) {
            if(direction == 0) {
                if(x == n - 1 || answer[y][x + 1] != 0) {
                	answer[y][x] = num;
                    direction = 1;
                }
                else answer[y][x++] = num++;
            } else if(direction == 1) {
                if(y == n - 1 || answer[y + 1][x] != 0) {
                	answer[y][x] = num;
                    direction = 2;
                }
                else answer[y++][x] = num++;
            } else if(direction == 2) {
                if(x == 0 || answer[y][x - 1] != 0) {
                	answer[y][x] = num;
                    direction = 3;
                }
                else answer[y][x--] = num++;
            } else if(direction == 3) {
                if(y == 0 || answer[y - 1][x] != 0) {
                	answer[y][x] = num;
                    direction = 0;
                }
                else answer[y--][x] = num++;
            }
        }
        answer[y][x] = num;
        return answer;
    }
}