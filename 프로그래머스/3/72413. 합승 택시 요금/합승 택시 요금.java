import java.util.*;

class Solution {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        
        int INF = 20000000;
        int [][]dist = new int[n+1][n+1];
        for(int i = 0; i <= n; i++){
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }
        
        for(int[] fare : fares){
            int u = fare[0];
            int v = fare[1];
            int w = fare[2];
            dist[u][v] = w;
            dist[v][u] = w;
         }
        
        for(int k = 1; k <= n; k++){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    if(dist[i][j] > dist[i][k] + dist[k][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        
        int answer = INF;
        for(int i = 1; i <= n; i++){
            answer = Math.min(answer, dist[s][i] + dist[i][a] + dist[i][b]);
        }
        
        return answer;
    }
}