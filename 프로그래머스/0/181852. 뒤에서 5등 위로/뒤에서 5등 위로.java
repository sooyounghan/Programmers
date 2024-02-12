class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        
        for(int i = 0; i < num_list.length - 1; i++) {
            for(int j = 0; j < num_list.length - 1 - i; j++) {
                if(num_list[j] > num_list[j + 1]) {
                    int temp = num_list[j];
                    num_list[j] = num_list[j + 1];
                    num_list[j + 1] = temp;
                }
            }
        }
        
        for(int i = 5, j = 0; i < num_list.length; i++) {
            answer[j++] = num_list[i];
        }
        
        return answer;
    }
}