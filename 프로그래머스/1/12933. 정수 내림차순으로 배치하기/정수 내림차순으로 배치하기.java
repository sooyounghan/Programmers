import java.util.*;

class Solution {
    public long solution(long n) {
    long answer = 0;
    List<Long> n_list = new ArrayList<Long>();
    
    while(n > 0) {
        n_list.add((long)(n % 10));
        n /= 10;
    }

    Collections.sort(n_list, Collections.reverseOrder());
    
    for(int i = 0; i < n_list.size(); i++) {
      answer *= 10;
      answer += n_list.get(i);
    }
    
    return answer;
  }
}