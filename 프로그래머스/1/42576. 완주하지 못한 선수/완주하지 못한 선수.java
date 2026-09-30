import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < participant.length; i++){
            int tmp = hm.getOrDefault(participant[i], 0);
            hm.put(participant[i], tmp+1);
        }
        
        for(int i = 0; i < completion.length; i++){
            int tmp = hm.getOrDefault(completion[i], 0);
            if(tmp == 1){
                hm.remove(completion[i]);
            }
            else{
                hm.put(completion[i], tmp - 1);
            }
        }
        
        for(String key : hm.keySet()){
            return key;
        }
        
        return "error";
        
    }
}