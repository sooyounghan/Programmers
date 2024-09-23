import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            List<Integer> list_array = new ArrayList<>();
            
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            
            for(int j = start; j <= end; j++) {
                list_array.add(array[j]);
            }
            
            Collections.sort(list_array);
            answer[i] = list_array.get(commands[i][2] - 1);
        }
        return answer;
    }
}