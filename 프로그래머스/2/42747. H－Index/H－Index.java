import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int ans = 0;
        int i = 0;
        Arrays.sort(citations);

        if(citations[citations.length - 1] == 0){
            return 0;
        }

        
        
        while(true){
            while(i < citations.length && citations[i] < ans){
                i++;
            }

            if(ans > citations.length - i){
                return ans-1;
            }
            ans += 1;
        }
        
        
    }
}