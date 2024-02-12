class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        int arr_length = arr.length;

        if(arr_length % 2 == 0) {
            for(int i = 1; i < arr.length; i = i + 2) {
                arr[i] += n;
            }
        }
        
        else {
            for(int i = 0; i < arr.length; i = i + 2) {
                arr[i] += n;
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}