import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b) -> {
            if(a[2] != b[2]){
                return a[2] - b[2];
            }
            if(a[1] != b[1]){
                return a[1] - b[1];
            }
            if(a[0] != b[0]){
                return a[0] - b[0];
            }
            return a[0] - b[0];
        });
        
        PriorityQueue<int []> tq = new PriorityQueue<>((a,b) -> {
            if(a[1] != b[1]){
                return a[1] - b[1];
            }
            return a[1] - b[1];
        });
        
        for(int i = 0; i < jobs.length; i++){
            tq.add(new int[]{i, jobs[i][0], jobs[i][1]});
        }
        
        int i = 0;
        int time = 0;
        int wow = 0;
        
        List<Integer> list = new ArrayList<>();
        
        while(true){
            if(tq.isEmpty() && pq.isEmpty() && time == 0){
                break;
            }
            
            while(!tq.isEmpty() && tq.peek()[1] <= i){
                pq.add(tq.poll());
            }
            
            if(pq.isEmpty() && !tq.isEmpty()){
                int []tmp = tq.poll();
                pq.add(tmp);
                i = tmp[1];
                while(!tq.isEmpty() && tq.peek()[1] == i){
                    pq.add(tq.poll());
                }
            }
            
            if(!pq.isEmpty()){
                int []tmp = pq.poll();
                i += tmp[2];
                list.add(i - tmp[1]);
            }
            
        
        }
        
        int py = 0;
        for(int j = 0; j < list.size(); j++){
            py += list.get(j);
            
        }
        return py / list.size();
    }
}