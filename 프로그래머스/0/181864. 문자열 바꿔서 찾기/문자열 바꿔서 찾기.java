class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String temp = "";
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'A') {
                temp += (char)(myString.charAt(i) + 1);
            }
            else if(myString.charAt(i) == 'B') {
                temp += (char)(myString.charAt(i) - 1);
            }
        }
        if(temp.contains(pat)) answer = 1;
        else answer = 0;
        
        return answer;
    }
}