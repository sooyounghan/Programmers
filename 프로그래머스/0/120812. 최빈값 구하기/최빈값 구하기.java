class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int num = -1;
        int max_array = Integer.MIN_VALUE;
        int max_count = Integer.MIN_VALUE;
        int[] count = null;
        
        for(int i = 0; i < array.length; i++) {
            if(max_array < array[i]) {
                max_array = array[i];
            }
        }
        
        count = new int[max_array + 1];
        
        for(int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        
        for(int i = 0; i < count.length; i++) {
            if(max_count < count[i]) {
                max_count = count[i];
                num = i;
            }
        }

        answer = num;
        
        for(int i = 0; i < count.length; i++) {
            if(i != num && max_count == count[i]) {
                answer = -1;
            }
        }
        return answer;
    }
}