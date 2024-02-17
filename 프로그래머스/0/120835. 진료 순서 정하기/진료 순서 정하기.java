class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        boolean[] visit = new boolean[emergency.length];
        int max_priority_index = -1;
        int priority = 1;
        
        while(priority <= emergency.length) {
            int max_emergency = Integer.MIN_VALUE;

            for(int i = 0; i < emergency.length; i++) {
                if(!visit[i]) {
                    if(max_emergency < emergency[i]) {
                        max_emergency = emergency[i];
                        max_priority_index = i;
                    }
                }
            }

            visit[max_priority_index] = true;
            answer[max_priority_index] = priority++;
        }
        
        return answer;
    }
}