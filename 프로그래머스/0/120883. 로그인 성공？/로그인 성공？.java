import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        Map<String, String> id_pw_db = new HashMap<String, String>();
        
        for(int i = 0; i < db.length; i++) {
            id_pw_db.put(db[i][0], db[i][1]);
        }
        
        for(int i = 0; i < db.length; i++) {
            if(db[i][0].equals(id_pw[0])) {
                if(id_pw_db.get(db[i][0]).equals(id_pw[1])) {
                    answer = "login";
                    break;            
                }
                else answer = "wrong pw";
            }
        }
        
        return answer;
    }
}