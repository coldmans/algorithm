import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < operations.length; i++){
            String tmp = operations[i];
            if(tmp.charAt(0) == 'I'){
                int tt;
                if(tmp.charAt(2) == '-'){
                    tt = Integer.parseInt(tmp.split("-")[1]);
                    tt *= -1;
                }
                else{
                    tt = Integer.parseInt(tmp.split(" ")[1]);
                }
                
                pq.add(tt);
            }
            
            else if(tmp.charAt(2) == '1'){
                if(!pq.isEmpty()){
                    List<Integer> list = new ArrayList<>();
                    int t = pq.size();
                    for(int j = 0; j < t - 1; j++){
                        list.add(pq.poll());
                    }
                    pq.poll();
                    for(int j = 0; j < list.size(); j++){
                        pq.add(list.get(j));
                    }
                }
            }
            
            else{
                if(!pq.isEmpty()){
                    pq.poll();
                }
            }
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        if(pq.isEmpty()){
            return answer;
        }
        else{
            int t = pq.poll();
            min = t;
            max = t;
            while(!pq.isEmpty()){
                max = pq.poll();
            }
            answer[1] = min;
            answer[0] = max;
        }
        return answer;
    }
}