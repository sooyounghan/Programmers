import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        boolean check = false;
        List<Character> A_list = new ArrayList<Character>();
        List<Character> B_list = new ArrayList<Character>();

        
        if(A.equals(B)) answer = 0;
        else {
            for(int i = 0; i < A.length(); i++) {
                A_list.add((char)A.charAt(i));
                B_list.add((char)B.charAt(i));
            }
            
            for(int i = 0; i < A.length(); i++) {
                char ch = A_list.remove(A_list.size() - 1);
                A_list.add(0, (char)ch);
                
                for(int j = 0; j < B.length(); j++) {
                    if(A_list.get(j) == B_list.get(j)) {
                        check = true;
                    }
                    else {
                        check = false;
                        break;
                    }
                }
                if(check) {
                    answer = i + 1;
                    break;
                }
            }
        }
        return answer;
    }
}