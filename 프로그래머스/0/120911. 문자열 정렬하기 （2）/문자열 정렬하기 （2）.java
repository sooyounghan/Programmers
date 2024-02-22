class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] answer_arr = my_string.toLowerCase().toCharArray();
        
        for(int i = 0; i < answer_arr.length - 1; i++) {
            for(int j = 0; j < answer_arr.length - i - 1; j++) {
                if(answer_arr[j] > answer_arr[j + 1]) {
                    char temp = answer_arr[j];
                    answer_arr[j] = answer_arr[j + 1];
                    answer_arr[j + 1] = temp;
                }
            }
        }
        
        answer = new String(answer_arr);
        return answer;
    }
}