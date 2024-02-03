class Solution {
    public String solution(String my_string, int m, int c) {   
        String temp = "";
        
        char[] answer_temp = new char[my_string.length() / m];
        
        for(int i = 0; i < my_string.length() / m; i++) {
            temp = my_string.substring(i * m, (i+1) * m);
            System.out.println(temp);
            answer_temp[i] = temp.charAt(c-1);
            System.out.println(answer_temp[i]);
        }
    
        String answer = new String(answer_temp);
        return answer;
    }
}