import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int work : works){
            queue.add(work);
        }
        for(int i = 0; i < n; i++){
            int tmp = queue.poll() - 1;
            if(tmp == -1){
                tmp += 1;
            }
            queue.add(tmp);
        }
        for(int i = 0; i < works.length; i++){
            long tmp = queue.poll();
            answer += tmp * tmp;
        }
        return answer;
    }
}