class Solution {
    public int solution(String[] babbling) {
        String[] word = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(int i = 0; i < babbling.length; i++) {
            int index = 0;
            for(int j = 0; j < word.length; j++) {
                if(babbling[i].contains(word[j])) {
                    index += word[j].length();
                }
            }
            if(index == babbling[i].length()) {
                answer++;
                continue;
            }
            else continue;
        }
        return answer;
    }
}