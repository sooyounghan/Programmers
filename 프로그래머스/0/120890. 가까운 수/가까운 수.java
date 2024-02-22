class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int close_num = Integer.MAX_VALUE;
        
        for(int i = 0; i < array.length; i++) {
            if(close_num > Math.abs(n - array[i])) {
                close_num = Math.abs(n - array[i]);
                answer = array[i];
            }
            else if(close_num == Math.abs(n - array[i])) {
                if(answer > array[i]) answer = array[i];
            }
        }
        return answer;
    }
}