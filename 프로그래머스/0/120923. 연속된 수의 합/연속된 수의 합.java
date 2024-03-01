import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = null;

        List<Integer> result = new ArrayList<Integer>();

        for(int i = -50; ;i++) {
            int sum = 0;

            for(int j = 0; j < num; j++) {
                sum += i + j;
            }

            if(sum == total) {
                for(int j = i; j < i + num; j++) {
                    result.add(j);
                }
                break;
            }
        }

        answer = new int[result.size()];

        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}