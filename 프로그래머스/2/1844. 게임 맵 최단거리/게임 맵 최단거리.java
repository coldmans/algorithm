import java.util.*;


class Solution {
    static int []dy = {0, 1, -1, 0};
    static int []dx = {1, 0, 0, -1};
    public int solution(int[][] maps) {
        int answer = 0;
        int N = maps.length;
        int M = maps[0].length;
        
        int [][]visited = new int[N][M];
        Queue<int []> queue = new ArrayDeque<>();
        queue.add(new int[]{0,0,1});
        visited[0][0] = 1;
        
        
        while(!queue.isEmpty()){
            int[] tmp = queue.poll();
            if(tmp[0] == N-1 && tmp[1] == M-1){
                return tmp[2];
            }
            for(int i = 0; i < 4; i++){
                int y = tmp[0] + dy[i];
                int x = tmp[1] + dx[i];
                
                if(0 <= y && y < N && 0 <= x && x < M && visited[y][x] != 1 && maps[y][x] == 1){
                    visited[y][x] = 1;
                    queue.add(new int[]{y,x,tmp[2] + 1});
                }
            }
            
        }
        return -1;
    }
}