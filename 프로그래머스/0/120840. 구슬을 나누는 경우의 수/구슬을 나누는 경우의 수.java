import java.math.*;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger answer = factorial(BigInteger.valueOf(balls)).divide(factorial(BigInteger.valueOf(balls - share)).multiply(factorial(BigInteger.valueOf(share))));
        return answer;
    }
    
    public BigInteger factorial(BigInteger n) {
        if(n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) return BigInteger.ONE;
        
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}