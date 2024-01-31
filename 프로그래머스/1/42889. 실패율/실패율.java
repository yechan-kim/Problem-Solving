import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        List<Integer> list = new ArrayList<>();
        int[] cnt = new int[N];
        double[] rate = new double[N];
        int size = stages.length;
        
        for(int i=0; i<stages.length; i++){
            if(stages[i] > N)
                continue;
            cnt[stages[i]-1]++;    
        }
        
        rate[0] = (double)cnt[0] / size;
        
        for(int i=1; i<N; i++){
            size -= cnt[i-1];
            
            if(size == 0)
                rate[i] = 0;
            else
                rate[i] = (double)cnt[i] / size;
        }
        
        Double[] sorted_rate = Arrays.stream(rate).boxed().toArray(Double[]::new);
        Arrays.sort(sorted_rate, Collections.reverseOrder());
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(sorted_rate[i] == rate[j]){
                    if(!list.contains(j+1)){
                        list.add(j+1);
                        break;
                    }
                }
            }
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}