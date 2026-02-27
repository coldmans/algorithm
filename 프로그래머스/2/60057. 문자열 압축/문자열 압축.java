import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = s.length();
        for(int i = 1; i < s.length(); i++){
            List<String> list = new ArrayList<>();
            
            for(int j = 0; j < s.length(); j += i){
                if(i + j > s.length()) break;
                list.add(s.substring(j, j + i));
            }
            
            
            
            int minus = 0;
            int []dp = new int[list.size()];

            for(int k = 1; k < list.size(); k++){
                if(list.get(k).equals(list.get(k-1))){
                    dp[k] = dp[k-1] + 1;
                }
                else{
                    if(dp[k-1] != 0){
                        if(dp[k-1] < 9){
                            minus += dp[k-1] * i - 1;
                        }
                        else if(dp[k-1] < 99){
                            minus += dp[k-1] * i - 2;
                        }
                        else if(dp[k-1] < 999){
                            minus += dp[k-1] * i - 3;
                        }
                        else{
                            minus += dp[k-1] * i - 4;
                        }
                    }
                }
            }
            
            if(dp[list.size()-1] != 0){
                if(dp[list.size()-1] < 9){
                    minus += dp[list.size()-1] * i - 1;
                }
                else if(dp[list.size()-1] < 99){
                    minus += dp[list.size()-1] * i - 2;
                }
                else if(dp[list.size()-1] < 999){
                    minus += dp[list.size()-1] * i - 3;
                }
                else{
                    minus += dp[list.size()-1] * i - 4;
                }
            }
            
            
        
        
            
            answer = Math.min(answer, s.length() - minus);
            
        }
        
        return answer;
    }
}