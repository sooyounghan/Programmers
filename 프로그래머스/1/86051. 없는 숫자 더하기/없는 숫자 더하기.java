class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] number_check = new boolean[10];
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j <= 9; j++) {
                if(numbers[i] == j) number_check[j] = true;
            }
        }
        
        for(int i = 0; i < number_check.length; i++) {
            if(!number_check[i]) answer += i;
        }
        
        return answer;
    }
}