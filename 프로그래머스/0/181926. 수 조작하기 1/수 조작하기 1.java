class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        for(int i = 0; i < control.length(); i++) {
            switch(control.charAt(i)) {
                case 'w' : 
                    n = n + 1;
                    break;
                case 's' :
                    n = n - 1;
                    break;
                case 'd' :
                    n = n + 10;
                    break;
                case 'a' :
                    n = n - 10;
                    break;
            }
        }
        
        answer = n;
        return answer;
    }
}