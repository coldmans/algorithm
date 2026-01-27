class Solution {
    public int solution(int n, int w, int num) {
        
        int tmp = 1;
        int cnt = 0;
        int row = -1;
        for(int i = 1; i <= n; i++){
            if((i - 1) % w == 0){
                if(i == 7){
                    System.out.println("왜 실행안하노");
                }
                System.out.println();
            }
            else if(((i - 1) / w) % 2 == 1){
                tmp -= 1;
            }
            else{
                tmp += 1;
            }
            
            if(i == num){
                row = tmp;
            }
            
            if(row != -1 && tmp == row){
                cnt += 1;
            }
            
            System.out.print(tmp + " ");
            
        }
        
        return cnt;
    }
}