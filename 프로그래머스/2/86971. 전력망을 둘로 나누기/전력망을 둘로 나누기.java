import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        int [][]graph = new int[n+1][n+1];
        for(int i = 0; i < wires.length; i++){
            graph[wires[i][0]][wires[i][1]] = 1;
            graph[wires[i][1]][wires[i][0]] = 1;
        }
        
        for(int i = 0; i < wires.length; i++){
            int o = wires[i][0];
            int t = wires[i][1];
            
            Queue<Integer> queue = new ArrayDeque<>();
            boolean []visited = new boolean[n+1];
            visited[o] = true;
            visited[t] = true;
            queue.add(o);
            int count = 0;
            while(!queue.isEmpty()){
                int tmp = queue.poll();
                count += 1;
                for(int j = 1; j <= n; j++){
                    if(graph[tmp][j] == 1 && !visited[j]){
                        visited[j] = true;
                        queue.add(j);
                    }
                }
            }
            
            queue.clear();
            
            boolean []visited2 = new boolean[n+1];
            visited2[o] = true;
            visited2[t] = true;
            int count2 = 0;
            queue.add(t);
            while(!queue.isEmpty()){
                int tmp = queue.poll();
                count2 += 1;
                for(int j = 1; j <= n; j++){
                    if(graph[tmp][j] == 1 && !visited2[j]){
                        visited2[j] = true;
                        queue.add(j);
                    }
                }
            }
            
            if(count2 > count){
                int tt = count2;
                count2 = count;
                count = tt;
            }
            
            
            answer = Math.min(answer, (count - count2));
            
            
        }
        
        return answer;
    }
}