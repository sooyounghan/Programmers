class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        switch(direction) {
            case "left" :
                answer[numbers.length - 1] = numbers[0];
                for(int i = 1, j = 0; i < numbers.length; i++) {
                    answer[j++] = numbers[i];
                }
                break;
                
            case "right" :
                answer[0] = numbers[numbers.length - 1];
                for(int i = 0, j = 1; i < numbers.length - 1; i++) {
                    answer[j++] = numbers[i];
                }
                break;
        }
        return answer;
    }
}