class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        int date1_sum = 0;
        int date2_sum = 0;
        
        int year1 = date1[0];
        int month1 = date1[1];
        int day1 = date1[2];
        
        int year2 = date2[0];
        int month2 = date2[1];
        int day2 = date2[2];
        
        for(int i = 1; i <= year1 - 1; i++) {
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                date1_sum += 366;
            } 
            else date1_sum += 365;
        }

        for(int i = 1; i <= month1; i++) {
            switch(i) {
                case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
                    date1_sum += 31;
                    break;
                    
                case 4 : case 6 : case 9 : case 11 :
                    date1_sum += 30;
                    break;
                case 2 :
                    if((year1 % 4 == 0 && year1 % 100 != 0) || year1 % 400 == 0) {
                        date1_sum += 29;
                    }
                    else date1_sum += 28;
                    break;
            }
        }
        
        date1_sum += day1;
        
        for(int i = 1; i <= year2 - 1; i++) {
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                date2_sum += 366;
            } 
            else date2_sum += 365;
        }

        for(int i = 1; i <= month2; i++) {
            switch(i) {
                case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
                    date2_sum += 31;
                    break;
                    
                case 4 : case 6 : case 9 : case 11 :
                    date2_sum += 30;
                    break;
                case 2 :
                    if((year2 % 4 == 0 && year2 % 100 != 0) || year2 % 400 == 0) {
                        date2_sum += 29;
                    }
                    else date2_sum += 28;
                    break;
            }
        }

        date2_sum += day2;
        if(date1_sum < date2_sum) answer = 1;
        else answer = 0;
        
        return answer; 
    }
}