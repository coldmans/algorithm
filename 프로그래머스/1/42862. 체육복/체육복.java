class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i = 1; i <= n; i++){
            arr[i] = 1;
        }
        for(int lo : lost){
            arr[lo] -= 1;
        }
        for(int re : reserve){
            arr[re] += 1;
        }
        
        for(int i = 1; i <= n; i++){
            if(arr[i] == 2){
                if(arr[i-1] == 0 && i >= 2){
                    arr[i-1] = 1;
                    arr[i] = 1;
                }
                else if(i < n && arr[i+1] == 0){
                    arr[i+1] = 1;
                    arr[i] = 1;
                }
            }
        }
        
        for(int i = 1; i <= n; i++){
            if(arr[i] >= 1){
                answer += 1;
            }
        }
        return answer;
    }
}