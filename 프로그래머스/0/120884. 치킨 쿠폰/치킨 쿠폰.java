class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int service_chicken = 0;
        
        while(chicken >= 10) {
            int coupon = chicken % 10;
            service_chicken += (chicken / 10);
            chicken = (chicken / 10) + coupon;  
        }
        answer = service_chicken;
        return answer;
    }
}