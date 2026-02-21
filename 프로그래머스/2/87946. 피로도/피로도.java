import java.util.*;

class Solution {
    static int answer;
        static boolean[] visited;
    static void recur(int[][] dungeons, int kk, int tmp){
        answer = Math.max(answer, kk);

        for(int i = 0; i < dungeons.length; i++){
            if(!visited[i] && tmp >= dungeons[i][0]){
                visited[i] = true;
                recur(dungeons, kk+1, tmp - dungeons[i][1]);
                visited[i] = false;
            }
        }
    }
    public int solution(int k, int[][] dungeons) {
        answer = -1;
        visited = new boolean[dungeons.length];
        
        recur(dungeons, 0, k);
        
        return answer;
    }
}