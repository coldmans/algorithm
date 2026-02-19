import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        
        if(n == 1){
            return 1;
        }

        while(n != 1){
            if(n % 2 == 1 || n == 2){
                ans += 1;
                n -= 1;
            }
            else{
                n /= 2;
            }
        }
        
        

        return ans;
    }
}