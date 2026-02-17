import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Integer []graph = new Integer[10000001];
        for(int i = 0; i < graph.length; i++){
            graph[i] = 0;
        }
        for(int i = 0; i < tangerine.length; i++){
            graph[tangerine[i]] += 1;
        }
        Arrays.sort(graph, Collections.reverseOrder());
        int tmp = 0;
        int ctt = 0;
        for(int i = 0; i < tangerine.length; i++){
            tmp += graph[i];
            ctt ++;
            if(tmp >= k){
                break;
            }
        }
        return ctt;
    }
}