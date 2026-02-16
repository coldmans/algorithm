class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        if(n > m){
            int tmp = m;
            m = n;
            n = tmp;
        }
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0 && m % i == 0){
                answer[0] = i;
            }
        }
        
        for(int i = n; i <= n*m; i+=n){
            if(i % m == 0){
                answer[1] = i;
                break;
            }
        }
        
        
        return answer;
    }
}