class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] rank_3 = new int[3];
        int current_rank = 1;
        int count = 0;
        
        while(count < 3) {
            for(int i = 0; i < rank.length; i++) {
                if(rank[i] == current_rank) {
                    if(attendance[i]) {
                        rank_3[count] = i;
                        count++;
                        current_rank++;
                        
                        if(count == 3) break;
                    }
                    else {
                        current_rank++;
                        continue;
                    }
                }
                else continue;
            }
        }
        
        answer = 10000 * rank_3[0] + 100 * rank_3[1] + rank_3[2];
        return answer;
    }
}