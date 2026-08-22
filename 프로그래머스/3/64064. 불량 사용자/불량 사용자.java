import java.util.*;

class Solution {
    
    static Set<Integer> set = new HashSet<>();
    static int answer = 0;
    
    public void recur(int i, boolean []banned, String[] banned_id, String[] user_id, int tmp, int ban){
        if(i == user_id.length){
            if(ban == banned.length){
                set.add(tmp);
            }
            return;
        }
        
        String s = user_id[i];
        for(int u = 0; u < banned_id.length; u++){
            if(banned[u]){
                continue;
            }
            String x = banned_id[u];
            if(s.length() != x.length()){
                continue;
            }
            boolean n = true;
            for(int k = 0; k < s.length(); k++){
                if(s.charAt(k) != x.charAt(k) && x.charAt(k) != '*'){
                    n = false;
                    break;
                }
            }
            
            if(n){
                banned[u] = true;
                tmp += Math.pow(2,i);
                recur(i+1, banned, banned_id, user_id, tmp, ban+1);
                tmp -= Math.pow(2,i);
                banned[u] = false;
            }
        }
        recur(i+1, banned, banned_id, user_id, tmp, ban);
        
        
    }
    
    public int solution(String[] user_id, String[] banned_id) {
        int answer = 0;
        boolean []banned = new boolean[banned_id.length];
        
        recur(0, banned, banned_id, user_id, 0, 0);
        answer = set.size();
        
        return answer;
    }
}