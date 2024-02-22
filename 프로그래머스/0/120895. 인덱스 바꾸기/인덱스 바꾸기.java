class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] temp_arr = my_string.toCharArray();
        
        temp_arr[num1] = my_string.charAt(num2); 
        temp_arr[num2] = my_string.charAt(num1);

        return new String(temp_arr);
    }
}