import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        Queue<int []> queue = new ArrayDeque<>();
        queue.add(new int[]{y, 0});
        while(!queue.isEmpty()){
            int []tmp = queue.poll();
            
            int yv = tmp[0];
            int ctt = tmp[1];
            
            if(yv == x){
                return ctt;
            }
            
            if(yv % 3 == 0 && yv / 3 >= x){
                queue.add(new int[]{yv / 3, ctt + 1});
            }
            if(yv % 2 == 0 && yv / 2 >= x){
                queue.add(new int[]{yv / 2, ctt + 1});
            }
            if(yv - n >= x){
                queue.add(new int[]{yv - n, ctt + 1});
            }
            
        }
        return -1;
    }
}