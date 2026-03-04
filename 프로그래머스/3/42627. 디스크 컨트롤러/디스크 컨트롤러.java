import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[0] == b[0]){
                if(a[1] == b[1]){
                    return a[2] - b[2];
                }
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        
        
        PriorityQueue<int[]> tmpQ = new PriorityQueue<>((a,b) -> {
            return a[0] - b[0];
        });
        
        for(int i = 0; i < jobs.length; i++){
            tmpQ.add(new int[]{jobs[i][0], jobs[i][1], i});
        }
        
        int zak = 0;
        int tt = 0;
        for(int i = 0; i <= 10000001; i++){
            while(!tmpQ.isEmpty() && tmpQ.peek()[0] == i){
                int []tmp = tmpQ.poll();
                pq.add(new int[]{tmp[1], tmp[0], tmp[2]});
            }
            
            if(zak > 0){
                zak -= 1;
                if(zak == 0){
                    answer += i - tt;
                    System.out.println(answer);
                    tt = 0;
                }
            }
            
            if(zak == 0 && tmpQ.isEmpty() && pq.isEmpty()){
                break;
            }
            if(zak == 0 && !pq.isEmpty()){
                int []tmp = pq.poll();
                zak += tmp[0];
                tt = tmp[1];
            }
        }
        
        return answer/jobs.length;
    }
}