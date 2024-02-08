class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        int count = 0;
        
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'x') count++;
        }
        
        answer = new int[count + 1];
        
        for(int i = 0, j = 0; i < myString.length(); i++) {
            if(myString.charAt(i) != 'x') 
                answer[j]++;
            else 
                j++;
        }
        return answer;
    }
}