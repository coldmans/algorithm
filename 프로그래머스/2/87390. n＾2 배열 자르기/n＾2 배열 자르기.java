import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        
        List<Long> list = new ArrayList<>();
        for(long i = left; i <= right; i++){
            long tmp = i / n;
            long tmp2 = i % (long)n;
            long tt = Math.max(tmp, tmp2) + 1;
            
            list.add(tt);
        }
        int [] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}