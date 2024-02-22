class Solution {
    public long solution(String numbers) {
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String temp = "";
        long answer = 0;
        int end = 0;
        
        for(int i = 0; i < numbers.length(); i++) {
        	temp += numbers.charAt(i); // 성능 하락의 원인
        	
            switch(temp) {
            	case "zero" : answer = (answer * 10) + 0; temp = ""; break; 
            	case "one" : answer = (answer * 10) + 1; temp = ""; break;
            	case "two" : answer = (answer * 10) + 2; temp = ""; break;
            	case "three" : answer = (answer * 10) + 3; temp = ""; break;
            	case "four" : answer = (answer * 10) + 4; temp = ""; break;
            	case "five" : answer = (answer * 10) + 5; temp = ""; break;
            	case "six" : answer = (answer * 10) + 6; temp = ""; break;
            	case "seven" : answer = (answer * 10) + 7; temp = ""; break;
            	case "eight" : answer = (answer * 10) + 8; temp = ""; break;
            	case "nine" : answer = (answer * 10) + 9; temp = ""; break;
            }
        }
    	return answer;
    }
}