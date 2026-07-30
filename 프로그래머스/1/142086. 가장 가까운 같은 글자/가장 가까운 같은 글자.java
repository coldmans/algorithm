import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(hm.getOrDefault(s.charAt(i) , -1) == -1){
                answer[i] = -1;
                hm.put(s.charAt(i), i);
            }
            else{
                int tmp = hm.get(s.charAt(i));
                answer[i] = i - tmp;
                hm.put(s.charAt(i), i);
            }
        }
        return answer;
    }
}