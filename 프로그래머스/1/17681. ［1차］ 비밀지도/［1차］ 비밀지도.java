class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int [][]graph1 = new int[n][n];
        int [][]graph2 = new int[n][n];
        for(int i = 0; i < n; i++){
            int tmp = arr1[i];
            int j = 1;
            for(int k = 0; k < n; k++){
                j *= 2;
            }
            j /= 2;
            for(int k = 0; k < n; k++){
                if(tmp >= j){
                    tmp -= j;
                    graph1[i][k] = 1;
                }
                j /= 2;
                if(tmp == 0){
                    break;
                }
            }
        }
        
        
        for(int i = 0; i < n; i++){
            int tmp = arr2[i];
            int j = 1;
            for(int k = 0; k < n; k++){
                j *= 2;
            }
            j /= 2;
            for(int k = 0; k < n; k++){
                if(tmp >= j){
                    tmp -= j;
                    graph2[i][k] = 1;
                }
                j /= 2;
                if(tmp == 0){
                    break;
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            String tmp = "";
            for(int j = 0; j < n; j++){
                if(graph1[i][j] == 1 || graph2[i][j] == 1){
                    tmp += "#";
                }
                else{
                    tmp += " ";
                }
            }
            
            answer[i] = tmp;
        }
        return answer;
    }
}
