class Solution {
    public int solution(String[] strArr) {
        int[] str_length = new int[strArr.length];
        int[] count = null;
        
        int max_length = Integer.MIN_VALUE;
        int max_count = Integer.MIN_VALUE;
        
        for(int i = 0; i < strArr.length; i++) {
            str_length[i] = strArr[i].length();
            if(max_length < str_length[i]) max_length = str_length[i];
        }
        
        count = new int[max_length];
        
        for(int i = 0; i < str_length.length; i++) {
            count[str_length[i]-1]++;
        }
        
        for(int i = 0; i < count.length; i++) {
            if(max_count <= count[i]) max_count = count[i];
        }
        
        int answer = max_count;
        return answer;
    }
}