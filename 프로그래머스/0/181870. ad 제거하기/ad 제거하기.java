class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        int count = 0;
        
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].contains("ad")) count++;
        }
        
        answer = new String[strArr.length - count];
        
        for(int i = 0, j = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")) answer[j++] = strArr[i];    
        }
        return answer;
    }
}