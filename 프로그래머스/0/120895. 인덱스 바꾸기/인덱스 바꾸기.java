class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] temp_arr = my_string.toCharArray();
        String answer = "";

        for(int i = 0; i < temp_arr.length; i++) {
            if(i == num1) {
                char temp = temp_arr[num1];
                temp_arr[num1] = temp_arr[num2];
                temp_arr[num2] = temp;
                break;
            }
        }
        return answer = new String(temp_arr);
    }
}