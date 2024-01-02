class Solution {
    public int solution(int[] num_list) {
        int plus = 0;
        int mul = 1;
        for(int i=0; i<num_list.length; i++){
            plus += num_list[i];
            mul *= num_list[i];
        }
        if(mul < plus * plus)
            return 1;
        else
            return 0;
    }
}