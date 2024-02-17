class Solution {
    public int solution(int hp) {
        int general_ant = hp / 5;
        int soldier_ant = (hp % 5) / 3;
        int ant = (hp % 5) % 3;
        
        int answer = general_ant + soldier_ant + ant;
        return answer;
    }
}