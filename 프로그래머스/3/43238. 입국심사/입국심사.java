import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long i = 1;
        Arrays.sort(times);
        long j = (long) times[0] * n;
        
        
        while(i <= j){
            long time = (i + j) / 2;
            long tmp = 0;
            for(int k = 0; k < times.length; k++){
                tmp += time / times[k];
            }
            if(tmp < n){
                i = time + 1;
            }
            if(tmp >= n){
                answer = time;
                j = time - 1;
            }
        }
        
        return answer;
    }
}