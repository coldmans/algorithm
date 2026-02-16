import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int [][]graph = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(computers[i][j] == 1 && i != j){
                    graph[i][j] = 1;
                }
            }
        }
        
        int ctt = 0;
        boolean []visited = new boolean[n];
        Queue<Integer> queue = new ArrayDeque<>();
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                ctt += 1;
                queue.add(i);
                
                while(!queue.isEmpty()){
                    int tmp = queue.poll();
                    for(int j = 0; j < n; j++){
                        if(graph[tmp][j] == 1 && !visited[j]){
                            visited[j] = true;
                            queue.add(j);
                        }
                    }
                }
                
            }
        }
        
        
        
        return ctt;
    }
}