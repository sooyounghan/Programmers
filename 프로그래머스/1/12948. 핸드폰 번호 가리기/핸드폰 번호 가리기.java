class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] phone_number_arr = phone_number.toCharArray();
        
        for(int i = 0; i < phone_number_arr.length - 4; i++) {
            phone_number_arr[i] = '*';
        }
        
        answer = String.valueOf(phone_number_arr);
        
        return answer;
    }
}