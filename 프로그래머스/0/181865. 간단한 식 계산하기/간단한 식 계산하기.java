class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String temp = "";
        String[] temp_arr = new String[3];

        for(int i = 0, j = 0; i < binomial.length(); i++) {
            if(i == binomial.length() - 1) {
            	temp += binomial.charAt(i);
                temp_arr[j++] = temp;
                temp = "";
                break;
            }
            
        	if(binomial.charAt(i) != ' ') {
                temp += binomial.charAt(i);
            }
            
            else {
                temp_arr[j++] = temp;
                temp = "";
            }
        }
        
        switch(temp_arr[1]) {
            case "+" :
                answer = Integer.parseInt(temp_arr[0]) + Integer.parseInt(temp_arr[2]);
                break;
            case "-" :
                answer = Integer.parseInt(temp_arr[0]) - Integer.parseInt(temp_arr[2]);
                break;
            case "*" :
                answer = Integer.parseInt(temp_arr[0]) * Integer.parseInt(temp_arr[2]);
                break;
        }
        return answer;
    }
}