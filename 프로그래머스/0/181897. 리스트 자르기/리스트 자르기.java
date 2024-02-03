class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = null;
        int idx_a = slicer[0];
        int idx_b = slicer[1];
        int idx_c = slicer[2];

        switch(n) {
            case 1 :
                answer = new int[idx_b + 1];
                for(int i = 0 ; i <= idx_b; i++) {
                    answer[i] = num_list[i];
                }
                break;

            case 2 :
                answer = new int[num_list.length - idx_a ];
                for(int i = 0; i < num_list.length - idx_a; i++) {
                    answer[i] = num_list[idx_a + i];
                }
                break;

            case 3 :
                answer  = new int[idx_b - idx_a + 1];
                for(int i = 0; i <= idx_b - idx_a; i++) {
                    answer[i] = num_list[idx_a + i];
                }
                break;

            case 4 :
                answer = new int[(idx_b - idx_a) / idx_c + 1];
                for(int i = 0, j = idx_a; i <= (idx_b - idx_a) / idx_c; i++, j += idx_c) {
                    answer[i] = num_list[j];
                }
                break;

        }

        return answer;
    }
}