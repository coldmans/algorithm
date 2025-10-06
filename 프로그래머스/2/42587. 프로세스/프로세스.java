import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int []> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < priorities.length; i++){
            queue.add(new int[]{i, priorities[i]});
            list.add(priorities[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        int res = 0;
        while(true){
            int []tmp = queue.poll();
            if(tmp[1] == list.get(res)){
                res += 1;
                if(tmp[0] == location){
                    return res;
                }
            }
            else{
                queue.add(tmp);
            }
        }
    
        
    }
}