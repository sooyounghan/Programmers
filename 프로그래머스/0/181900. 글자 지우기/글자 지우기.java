import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        Arrays.sort(indices);
        
        boolean[] check = new boolean[my_string.length()];        

        for(int i = 0; i < indices.length; i++) {
            check[indices[i]] = true;
        }

        for(int i = 0; i < my_string.length(); i++) {
            if(!check[i]) answer += my_string.charAt(i);
        }

        return answer;
    }
}