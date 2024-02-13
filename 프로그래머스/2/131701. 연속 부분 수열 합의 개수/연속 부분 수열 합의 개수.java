import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
		int size = elements.length;

		for (int i=1; i<=size; i++) {
			for (int j=0; j<size; j++) {
				int sum = 0;
                
				for (int k=j; k < j+i; k++) {
					sum += elements[k % size];
				}
                
				set.add(sum);
			}
		}
        
		return set.size();
    }
}