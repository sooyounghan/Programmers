class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum_temp = 0;
        int mul_temp = 1;
        if(num_list.length > 10) {
            for(int i = 0; i < num_list.length; i++) {
                sum_temp += num_list[i];
            }
            answer = sum_temp;
        }
        else {
            for(int i = 0; i < num_list.length; i++) {
                mul_temp *= num_list[i];
            }
            answer = mul_temp;
        }
        return answer;
    }
}