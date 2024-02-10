class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int count = 0;
        
        for(int i = 0; i < arr.length; i++) {
            count += arr[i];   
        }
        
        answer = new int[count];
        
        for(int i = 0, j = 0; i < arr.length; i++) {
            for(int k = 0; k < arr[i]; k++) {
                answer[j++] = arr[i];
            }
        }
        
        return answer;
    }
}