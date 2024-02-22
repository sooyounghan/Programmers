class Solution {
    public int solution(String my_string) {
        String[] my_string_arr = my_string.split(" ");
        int answer = 0;
        String op = "";
    
        for(int i = 0; i < my_string_arr.length; i++) {
            if(my_string_arr[i].equals("+")) {
                op = my_string_arr[i];
            }
            else if(my_string_arr[i].equals("-")) {
                op = my_string_arr[i];
            }
            else {
            	if(op.equals("")) answer += Integer.parseInt(my_string_arr[i]);
            	else {
            		switch(op) {
	            		case "+" :
	            			answer += Integer.parseInt(my_string_arr[i]);
	            			op = "";
	            			break;
	            		case "-" :
	            			answer -= Integer.parseInt(my_string_arr[i]);
	            			op = "";
	            			break;
            		}
            	}
            }
        }
        return answer;
    }
}