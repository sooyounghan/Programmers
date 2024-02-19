class Solution {
    public int[] solution(String my_string) {
        int[] answer = null;
        int count = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
                count++;
            }
        }
        
        answer = new int[count];
        
        for(int i = 0, j = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
                answer[j++] = my_string.charAt(i) - '0';
            }
        }
        
        for(int i = 0; i < answer.length - 1; i++) {
            for(int j = 0; j < answer.length - i - 1; j++) {
                if(answer[j] > answer[j + 1]) {
                    int temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
            }
        }
        return answer;
    }
}