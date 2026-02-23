import java.util.*;

class Solution {
    public int solution(String[] board) {
        int answer = Integer.MAX_VALUE;
        int n = board.length;
        int m = board[0].length();
        int[][]graph = new int[n][m];
        int si = 0;
        int sj = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i].charAt(j) == 'D'){
                    graph[i][j] = 1;
                }
                else if(board[i].charAt(j) == 'G'){
                    graph[i][j] = 2;
                }
                else if(board[i].charAt(j) == 'R'){
                    si = i;
                    sj = j;
                }
            }
        }
            
            Queue<int []> queue = new ArrayDeque<>();
            queue.add(new int[]{si, sj, 0});
            int [][]visited = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    visited[i][j] = Integer.MAX_VALUE;
                }
            }
            visited[si][sj] = 0;
            
            while(!queue.isEmpty()){
                int []tmp = queue.poll();
                int ti = tmp[0];
                int tj = tmp[1];
                int tt = tmp[2];
                if(graph[ti][tj] == 2){
                    answer = Math.min(answer, tt);
                }
                for(int i = ti; i >= 0; i--){
                    if(i == 0){
                        if(visited[i][tj] > tt + 1){
                            visited[i][tj] = tt+1;
                            queue.add(new int[]{i,tj,tt+1});
                            
                        }
                        break;
                    }
                    else if(graph[i-1][tj] == 1){
                        if(visited[i][tj] > tt + 1){
                            visited[i][tj] = tt+1;
                            queue.add(new int[]{i, tj, tt+1});
                            
                        }
                        break;
                    }
                }
                
                
                for(int i = ti; i < n; i++){
                    if(i == n -1){
                        if(visited[i][tj] > tt + 1){
                            visited[i][tj] = tt+1;
                            queue.add(new int[]{i,tj,tt+1});
                            
                        }
                        break;
                    }
                    else if(graph[i+1][tj] == 1){
                        if(visited[i][tj] > tt + 1){
                            visited[i][tj] = tt+1;
                            queue.add(new int[]{i, tj, tt+1});
                            
                        }
                        break;
                    }
                }
                
                for(int j = tj; j < m; j++){
                    if(j == m -1){
                        if(visited[ti][j] > tt + 1){
                            visited[ti][j] = tt+1;
                            queue.add(new int[]{ti,j,tt+1});
                            
                        }
                        break;
                    }
                    else if(graph[ti][j + 1] == 1){
                        if(visited[ti][j] > tt + 1){
                            visited[ti][j] = tt+1;
                            queue.add(new int[]{ti, j, tt+1});
                            
                        }
                        break;
                    }
                }
                
                for(int j = tj; j >= 0; j--){
                    if(j == 0){
                        if(visited[ti][j] > tt + 1){
                            visited[ti][j] = tt+1;
                            queue.add(new int[]{ti,j,tt+1});
                        }
                        break;
                    }
                    else if(graph[ti][j-1] == 1){
                        if(visited[ti][j] > tt + 1){
                            visited[ti][j] = tt+1;
                            queue.add(new int[]{ti, j, tt+1});
                        }
                        break;
                    }
                }
            }
        if(answer == Integer.MAX_VALUE){
            return -1;
        }
        

        
        return answer;
    }
}