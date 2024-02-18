class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int num = 0;
        int count = 0;
            
        while(count != k) {
            answer = numbers[num];
            
            if((num + 2) >= numbers.length) num = (num + 2) % numbers.length;
            else num = num + 2;
            
            count++;
        }
        return answer;
    }
}