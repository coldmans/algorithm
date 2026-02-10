import java.util.*;

class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        int [][]graph = new int[n+1][n+1];
        for(int i = 0; i < results.length; i++){
            graph[results[i][0]][results[i][1]] = 1;
        }
        
        for(int i = 1; i <= n; i++){
            Queue<Integer> q = new ArrayDeque<>();
            graph[i][i] = 1;
            int []visited = new int[n+1];
            visited[i] = 1;
            q.add(i);
            while(!q.isEmpty()){
                int tmp = q.poll();
                for(int j = 1; j <= n; j++){
                    if(visited[j] == 0 && graph[tmp][j] == 1){
                        graph[i][j] = 1;
                        visited[j] = 1;
                        q.add(j);
                    }
                }
            }
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i = 1; i <= n; i++){
            boolean isTrue = true;
            for(int j = 1; j <= n; j++){
                
                if(graph[i][j] == 0 && graph[j][i] == 0){
                    isTrue = false;
                    break;
                }
            }
            if(isTrue){
                answer++;
            }
            
        }
        
        
        return answer;
    }
}