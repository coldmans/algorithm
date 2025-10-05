import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < participant.length; i++){
            hashMap.put(participant[i], hashMap.getOrDefault(participant[i], 0) + 1);
        }
        
        for(int i = 0; i < completion.length; i++){
            if(hashMap.containsKey(completion[i])){
                
                    hashMap.put(completion[i], hashMap.get(completion[i]) - 1);
                    if(hashMap.get(completion[i]) == 0){
                        hashMap.remove(completion[i]);
                    }
                
            }
        }
        
        
        String answer = hashMap.keySet().iterator().next();
        return answer;
    }
}