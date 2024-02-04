class Solution {
    public int[] solution(int[] num_list, int n) {
        if(num_list.length % n == 0) {
            int[] answer = new int[num_list.length / n];
            for(int i = 0, j = 0; i < answer.length; i++, j += n) {
                answer[i] = num_list[j];
            }
            return answer;
        }
        else {
            int[] answer = new int[num_list.length / n + 1];
            for(int i = 0, j = 0; i < answer.length; i++, j = j + n) {
                answer[i] = num_list[j];
            }
            return answer;
        }
    }
}