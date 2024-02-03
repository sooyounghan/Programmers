class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String temp = "";
        
        for(int i = 0; i < code.length(); i++) {
            int remainder = i % q; 
        	if(remainder == 0) temp = ""; 
            
            if(remainder < q) { 
            	temp += code.charAt(i); 
            }
            if(remainder == r) {
                answer += temp.charAt(r);  
            }  
        }
        return answer; 
    }
}