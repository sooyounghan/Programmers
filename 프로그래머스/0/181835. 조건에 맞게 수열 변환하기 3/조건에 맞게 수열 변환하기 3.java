class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        if(k % 2 != 0) {
            for(int i = 0; i < arr.length; i++) {
                answer[i] *= k;
            }
        }
        
        else {
            for(int i = 0; i < arr.length; i++) {
                answer[i] += k;
            }
        }
        
        return answer;
    }
}