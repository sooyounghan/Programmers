class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        boolean[] spell_check = new boolean[spell.length];
        boolean check = false;
        
        for(int i = 0; i < dic.length; i++) {
            if(dic[i].length() == spell.length) {
                for(int j = 0 ; j < spell.length; j++) {
                    spell_check[j] = false;
                    if(dic[i].contains(spell[j])) {
                        spell_check[j] = true;
                    }
                }
                
                for(int j = 0; j < spell_check.length; j++) {
                    if(spell_check[j]) {
                         check = true;
                    }
                    else {
                        check = false;
                        break;
                    }
                }
                
                if(check) {
                    answer = 1;
                    break;
                }
            }
        }
        
        if(check) answer = 1;
        return answer;
    }
}