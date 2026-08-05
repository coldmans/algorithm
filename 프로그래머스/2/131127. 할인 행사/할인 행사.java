import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < want.length; i++){
            map.put(want[i], 0);
        }
        
        for(int i = 0; i < 10; i++){
            int tmp = map.getOrDefault(discount[i], -1);
            if(tmp != -1){
                map.put(discount[i], map.get(discount[i]) + 1);
            }
        }
        boolean isOk = true;
        for(int i = 0; i < want.length; i++){
            if(map.get(want[i]) < number[i]){
                isOk = false;
            }
        }
        if(isOk){
            answer++;
        }
        
        for(int i = 10; i < discount.length; i++){
            isOk = true;
            if(map.getOrDefault(discount[i-10], -1) > 0){
                map.put(discount[i-10], map.get(discount[i-10]) -1);
            }
            if(map.getOrDefault(discount[i] , -1) >= 0){
                map.put(discount[i], map.get(discount[i]) +1);
            }
            
            for(int j = 0; j < want.length; j++){
                if(map.get(want[j]) < number[j]){
                    
                    isOk = false;
                }
            }
            if(isOk){
                answer++;
            }
        }
        return answer;
    }
}