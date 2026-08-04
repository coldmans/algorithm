import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }
        for(int []r : edge){
            graph.get(r[0]).add(r[1]);
            graph.get(r[1]).add(r[0]);
        }
        
        int []dist = new int[n+1];
        for(int i = 1; i <= n; i++){
            dist[i] = -1;
        }
        dist[1] = 0;
        
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        while(!queue.isEmpty()){
            int tmp = queue.poll();
            for(int next : graph.get(tmp)){
                if(dist[next] == -1){
                    dist[next] = dist[tmp] + 1;
                    queue.add(next);
                }
            }
        }
        
        int maxi = 0;
        for(int i = 1; i <= n; i++){
            maxi = Math.max(maxi, dist[i]);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(maxi == dist[i]){
                list.add(i);
            }
        }
        
        
        
        return list.size();
    }
}