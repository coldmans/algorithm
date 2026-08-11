import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long max = 0;
        for(int i = 0; i < times.length; i++){
            max = Math.max(max, times[i]);
        }
        long mt = n * max;
        long start = 0;
        long answer = 999999999;
        
        while(start < mt){
            long tmp = 0;
            long mid = (start + mt) / 2;
            for(int i = 0; i < times.length; i++){
                tmp += mid / times[i];
                if(tmp >= n){
                    break;
                }
            }
            if(tmp >= n){
                answer = mid;
                mt = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return answer;
    }
}