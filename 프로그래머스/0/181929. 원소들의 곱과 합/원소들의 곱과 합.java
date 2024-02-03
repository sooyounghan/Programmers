class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int total_mul = 1;
        int total_sum = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            total_mul *= num_list[i];
            total_sum += num_list[i];
        }
        
        if(total_mul < Math.pow(total_sum, 2)) answer = 1;
        else if(total_mul > Math.pow(total_sum, 2)) answer = 0;
        
        return answer;
    }
}