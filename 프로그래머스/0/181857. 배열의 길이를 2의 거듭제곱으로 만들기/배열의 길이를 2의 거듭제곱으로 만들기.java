class Solution {
    public int[] solution(int[] arr) {
        int arr_new_length = arr_length_pow(arr.length);
        int[] answer = new int[arr_new_length];
        
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        for(int i = arr.length; i < arr_new_length; i++) {
            answer[i] = 0;
        }
        return answer;
    }
    
    public static int arr_length_pow(int arr_length) {
        int new_arr_length = 0;
        for(int i = 0; ;i++) {
            if((int)Math.pow(2, i) >= arr_length) {
                new_arr_length = (int)Math.pow(2, i);
                break;
            }
        }
        
        return new_arr_length;
    }
}