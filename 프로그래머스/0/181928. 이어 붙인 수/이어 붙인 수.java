class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String sum_odd = "";
        String sum_even = "";
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) sum_even += String.valueOf(num_list[i]);
            else sum_odd += String.valueOf(num_list[i]);
        }
        
        answer = Integer.parseInt(sum_odd) + Integer.parseInt(sum_even);
        
        return answer;
    }
}