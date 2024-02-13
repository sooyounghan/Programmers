class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        boolean[] check = new boolean[str_list.length];
        
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].contains(ex)) check[i] = true;
        }
        
        for(int i = 0; i < str_list.length; i++) {
            if(!check[i]) answer += str_list[i];
        }
        
        return answer;
    }
}