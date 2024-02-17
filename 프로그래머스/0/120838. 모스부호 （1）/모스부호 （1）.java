class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String answer = "";
        int count = 0;
        int idx = 0;
        String[] letter_arr = null;
        
        for(int i = 0; i < letter.length(); i++) {
            if(letter.charAt(i) == ' ') count++;
        }
        
        letter_arr = new String[count + 1];
        
        for(int i = 0, j = 0; i < letter.length(); i++) {
            if(i == letter.length() - 1) letter_arr[j] = letter.substring(idx, letter.length());
            
            if(letter.charAt(i) == ' ') {
                letter_arr[j++] = letter.substring(idx, i);
                idx = i + 1;
            }
        }
        
        for(int i = 0; i < letter_arr.length; i++) {
            for(int j = 0; j < morse.length; j++) {
                if(letter_arr[i].equals(morse[j])) answer += (char)('a' + j);
            }
        }
        
        return answer;
    }
}