class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int start = 0;
        int end = num_list.length - 1;
            
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        while(start < end) {
            int temp = answer[start];
            answer[start] = answer[end];
            answer[end] = temp;
            
            start++;
            end--;
        }
        return answer;
    }
}