import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < scoville.length; i++){
            pq.add(scoville[i]);
        }
        while(true){
            if(pq.isEmpty()){
                return -1;
            }
            int n = pq.poll();
            if(n >= K){
                return answer;
            }
            if(pq.isEmpty()){
                return -1;
            }
            int m = pq.poll();
            pq.add(n + m*2);
            answer ++;
        }
        
    }
}