import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> sum = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(!sum.contains(numbers[i] + numbers[j])) {
                    sum.add(numbers[i] + numbers[j]);                
                }
            }
        }
        
        answer = new int[sum.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = sum.get(i);
        }
                
        Arrays.sort(answer);
        
        return answer;
    }
}