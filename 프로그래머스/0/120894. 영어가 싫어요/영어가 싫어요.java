class Solution {
    public long solution(String numbers) {
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String substring_numbers = new String(numbers);
        
        String temp_num = null;
        long answer = 0;
        int end = 0;
        
        while(!substring_numbers.equals("")) {
        	for(int i = 0; i < number.length; i++) {
        		if(substring_numbers.startsWith(number[i])) {
		        	end = number[i].length();
		            temp_num = substring_numbers.substring(0, end);
		            substring_numbers = substring_numbers.substring(end);
		            switch(temp_num) {
		            	case "zero" : answer = (answer * 10) + 0; break; 
		            	case "one" : answer = (answer * 10) + 1; break;
		            	case "two" : answer = (answer * 10) + 2; break;
		            	case "three" : answer = (answer * 10) + 3; break;
		            	case "four" : answer = (answer * 10) + 4; break;
		            	case "five" : answer = (answer * 10) + 5; break;
		            	case "six" : answer = (answer * 10) + 6; break;
		            	case "seven" : answer = (answer * 10) + 7; break;
		            	case "eight" : answer = (answer * 10) + 8; break;
		            	case "nine" : answer = (answer * 10) + 9; break;
		            }
	        	}
        	}
        }
    	return answer;
    }
}