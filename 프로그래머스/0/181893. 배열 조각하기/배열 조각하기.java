import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] query) {        
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++) {
            temp.add(arr[i]); 
        }
        
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
            	int temp_size = temp.size();
            	for(int j = query[i]+1; j < temp_size; j++) {
            		temp.remove(query[i]+1);
            	}
            }
            
            else {
                for(int j = 0; j < query[i]; j++) {
                    temp.remove(0);
                }
            }
        }
        
        int[] answer = new int[temp.size()];
        
        for(int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}