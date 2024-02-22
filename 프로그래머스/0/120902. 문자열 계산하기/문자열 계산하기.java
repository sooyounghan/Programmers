class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String temp = "";
        int num1 = 0;
        int num2 = 0;
        char op = ' ';
        
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(i == my_string.length() - 1) {
                temp += ch;
                num2 = Integer.parseInt(temp);
                temp = "";
                break;
            }
            
            if(ch != ' ') {
                if(ch == '+' || (ch == '-' && my_string.charAt(i + 1) == ' ')) {
                    op = ch;
                }
                else {
                    temp += ch;
                }
            }
            
            else if(ch == ' ') {
                if(temp.equals("")) continue;
                
                num1 = Integer.parseInt(temp);
                temp = "";
            }
        }
        
        switch(op) {
            case '+' :
                answer = num1 + num2;
                break;
            case '-' :
                answer = num1 - num2;
                break;
        }
        
        return answer;
    }
}