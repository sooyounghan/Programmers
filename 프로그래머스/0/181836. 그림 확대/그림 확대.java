class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        for(int i = 0; i < picture.length; i++) {
            answer[i * k] = "";
            for(int j = 0; j < picture[i].length(); j++) {
            	for(int m = 0; m < k; m++) {
            		answer[i * k] += picture[i].charAt(j);
            	}
            }
        }
            
        for(int i = 0; i < answer.length; i += k) {
            for(int j = 1; j < k; j++) {
            	answer[i + j] = answer[i];
            }
        }

        return answer;
    }
}