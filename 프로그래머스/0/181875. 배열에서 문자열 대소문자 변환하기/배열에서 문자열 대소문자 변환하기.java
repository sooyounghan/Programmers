class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        String temp = "";
        
        for(int i = 0; i < strArr.length; i++) {
            temp = "";
            if(i % 2 != 0) {
                for(int j = 0; j < strArr[i].length(); j++) {
                    char ch = strArr[i].charAt(j);
                    
                    if(ch >= 'a' && ch <= 'z') {
                        ch -= 32;
                        temp += ch;
                    }
                    else temp += ch;
                }
            }
            
            else {
                for(int j = 0; j < strArr[i].length(); j++) {
                    char ch = strArr[i].charAt(j);
                    
                    if(ch >= 'A' && ch <= 'Z') {
                        ch += 32;
                        temp += ch;
                    }
                    else temp += ch;
                }
            }
            answer[i] = temp;
        }
        return answer;
    }
}