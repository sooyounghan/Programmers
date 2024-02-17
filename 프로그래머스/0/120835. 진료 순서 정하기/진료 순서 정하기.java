class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        boolean[] visit = new boolean[emergency.length];
        int idx_max_emergency = -1;
        int priority = 1;
            
        while(priority <= emergency.length) {
            int max_priority = Integer.MIN_VALUE;
                                             
            for(int i = 0; i < emergency.length; i++) {
                if(!visit[i]) {
                    if(max_priority < emergency[i]) {
                        max_priority = emergency[i];
                        idx_max_emergency = i;
                    }
                }
                else continue;
            }

            visit[idx_max_emergency] = true;
            answer[idx_max_emergency] = priority++;
        }
        
        return answer;
    }
}