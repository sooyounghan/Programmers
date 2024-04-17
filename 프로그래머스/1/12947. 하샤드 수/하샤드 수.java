class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int harshad = 0;
        int x_copy = x;
        
        while(x_copy > 0) {
            harshad += (x_copy % 10);
            x_copy /= 10;
        }
        
        if(x % harshad == 0) answer = true;
        else answer = false; 
        
        return answer;
    }
}