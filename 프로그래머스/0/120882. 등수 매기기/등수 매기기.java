import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        boolean[] check = new boolean[score.length];
        double[] average = new double[score.length];
        int[] answer = new int[score.length];
        int idx = -1;
        int rank = 1;
      
        for(int i = 0; i < score.length; i++) {
            average[i] = (double)(score[i][0] + score[i][1]) / 2;
        }
        
        while(rank <= answer.length) {
            int same = 0;
            double max_score = 0.0;
            
            for(int i = 0; i < average.length; i++) {
                if(max_score <= average[i] && !check[i]) {
                    max_score = average[i];
                    idx = i;            
                }
            }
            answer[idx] = rank;
            check[idx] = true;
            
            for(int i = 0; i < average.length; i++) {
                if(max_score == average[i] && !check[i]) {
                    answer[i] = rank;
                    check[i] = true;
                    same++;
                }
            }
            if(same != 0) rank = rank + same + 1;
            else rank++;
        }
        
        return answer;
    }
}