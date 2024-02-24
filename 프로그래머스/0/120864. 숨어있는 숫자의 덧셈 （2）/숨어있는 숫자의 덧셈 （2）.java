class Solution {
    public int solution(String my_string) {
        char[] my_string_arr = my_string.toCharArray();
        int answer = 0;
        String num = "";
        
        for(int i = 0; i < my_string_arr.length; i++) {
            if(i == my_string_arr.length - 1) {
                if(my_string_arr[i] >= '0' && my_string_arr[i] <= '9') {
                    num += my_string_arr[i];
                    answer += Integer.parseInt(num);
                    break;
                }
            }
            if(my_string_arr[i] >= '0' && my_string_arr[i] <= '9') {
                num += my_string_arr[i];
                if((my_string_arr[i + 1] >= 'a' && my_string_arr[i + 1] <= 'z') || (my_string_arr[i + 1] >= 'A' && my_string_arr[i + 1] <= 'Z')) {
                    answer += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        return answer;
    }
}