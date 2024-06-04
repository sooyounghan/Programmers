class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for(int i = 0; i < t.length() - p.length() + 1; i++) {
            long num = Long.parseLong(t.substring(i, i + p.length()).trim());
            if(num <= Long.parseLong(p.trim())) answer++;
        }
        return answer;
    }
}