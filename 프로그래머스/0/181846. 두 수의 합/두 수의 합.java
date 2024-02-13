import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger a_num = new BigInteger(a);
        BigInteger b_num = new BigInteger(b);
        
        answer = String.valueOf(a_num.add(b_num));
        
        return answer;
    }
}