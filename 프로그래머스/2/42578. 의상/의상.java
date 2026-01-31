import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            if(hashMap.containsKey(clothes[i][1])){
                hashMap.put(clothes[i][1], hashMap.get(clothes[i][1]) + 1);
            }
            else{
                hashMap.put(clothes[i][1], 2);
            }
        }

        int ttmp = 1;

            for(String s : hashMap.keySet()){
                ttmp *= hashMap.get(s);
            }
            answer += ttmp;

        
        
        
        return answer - 1;
    }
}