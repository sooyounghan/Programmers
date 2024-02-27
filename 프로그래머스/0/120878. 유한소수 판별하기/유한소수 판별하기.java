class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int mod = 0;
        int deno = 0;
        
        for(int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0) {
                mod = i;
            }
        }
        
        deno = (b / mod);
        
        if(deno % 2 == 0 || deno % 5 == 0) {
            while(true) {
                if(deno % 2 == 0) deno /= 2;
                else if(deno % 5 == 0) deno /= 5;
                else break;
            } 
            if(deno == 1) answer = 1;
            else answer = 2;
        }
        else if(deno == 1) answer = 1;
        else answer = 2;
        
        return answer;
    }
}