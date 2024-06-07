class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        for(int i = 0; i < d.length; i++) {
            for(int j = i; j < d.length; j++)
                if(d[i] > d[j]) {
                    int temp = d[i];
                    d[i] = d[j];
                    d[j] = temp;
                }
        }
        
        for(int i = 0; i < d.length; i++) {
            sum += d[i];
            
            if(sum <= budget) answer++;
            else break;
        }
        
        return answer;
    }
}