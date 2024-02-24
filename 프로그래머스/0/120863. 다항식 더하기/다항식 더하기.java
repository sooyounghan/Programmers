class Solution {
    public String solution(String polynomial) {
	        String answer = "";
	        String[] polynomial_arr = polynomial.split(" ");
	        int coefficient = 0;
	        int number = 0;
	        
	        for(int i = 0; i < polynomial_arr.length; i++) {
	            if(i == polynomial_arr.length - 1 && !polynomial_arr[i].contains("x")) {
	            	if(polynomial_arr.length == 1) {
	            		if(polynomial_arr[i].contains("x")) coefficient += polynomial_arr[i].charAt(0) - '0';
	            		else number += Integer.parseInt(polynomial_arr[i]);
	            		break;
	            	}
	            	else if(polynomial_arr[i - 1].equals("+")) {
	                    number += Integer.parseInt(polynomial_arr[i]);
	                    break;
	                }
	            }
	            
	            if(polynomial_arr[i].contains("x")) {
	                String[] polynomial_x = polynomial_arr[i].split("x");
	                
	                if(polynomial_x.length == 0) {
	                    coefficient += 1;
	                }
	                else {
	                    coefficient += Integer.parseInt(polynomial_x[0]);
	                }
	            }
	            
	            else if((i != 0 && polynomial_arr[i - 1].equals("+")) && polynomial_arr[i + 1].equals("+")) {
	                number += Integer.parseInt(polynomial_arr[i]);
	            }
	            
	            else if(i == 0 && polynomial_arr[i + 1].equals("+")) {
	                number += Integer.parseInt(polynomial_arr[i]);
	            }
	        }
	         
	        if(coefficient == 0) {
		        answer = String.valueOf(number);
	        }
	        else if(number == 0) {
	        	if(coefficient == 1) answer = new String("x");
	        	else answer = new String(coefficient + "x");
	        }
	        else {
	        	if(coefficient == 1) answer = new String("x" + " + " + number);
	        	else answer = new String(coefficient + "x" + " + " + number);
	        }
	        return answer;
	}
}