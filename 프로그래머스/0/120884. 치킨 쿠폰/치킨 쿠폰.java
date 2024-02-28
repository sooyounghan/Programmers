class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int service_chicken = 0;
        int coupon = 0;
        
        while(true) {
            service_chicken += (chicken / 10);
            coupon += (chicken % 10);
            chicken = (chicken / 10) + (chicken % 10);  
        
            if((chicken + coupon) < 10) break;
        }
        answer = service_chicken;
        return answer;
    }
}