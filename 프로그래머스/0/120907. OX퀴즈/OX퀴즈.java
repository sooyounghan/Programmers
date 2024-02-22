class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++) {
            String[] quiz_one = quiz[i].split(" ");
            String op = "";
            int idx = 0;
            int result = 0;
            int result_quiz = 0;
            
            while(!quiz_one[idx].equals("=")) {
                if(quiz_one[idx].equals("+")) {
                    op = "+";
                    idx++;
                }
                else if(quiz_one[idx].equals("-")) {
                    op = "-";
                    idx++;
                }
                else {
                    if(op.equals("")) {
                        result = result + Integer.parseInt(quiz_one[idx]);
                        idx++;
                    }
                    switch(op) {
                        case "+" :
                            result = result + Integer.parseInt(quiz_one[idx]);
                            idx++;
                            op = "";
                            break;
                        case "-" : 
                            result = result - Integer.parseInt(quiz_one[idx]);
                            idx++;
                            op = "";
                            break;
                    }
                }
            }
           for(int j = idx + 1; j < quiz_one.length; j++) {
               if(quiz_one[j].equals("-")) {
                    op = "-";
               }
               else if(op.equals("-")) {
                   result_quiz = result_quiz - Integer.parseInt(quiz_one[j]);
               }
               else {
                   result_quiz = result_quiz + Integer.parseInt(quiz_one[j]);
               }
           } 
            if(result == result_quiz) answer[i] = "O";
            else answer[i] = "X";
        }
        return answer;
    }
}