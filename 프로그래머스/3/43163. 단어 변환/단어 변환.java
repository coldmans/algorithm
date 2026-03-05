import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        set.add(begin);
        map.put(begin, 0);
        Queue<String> queue = new ArrayDeque<>();
        queue.add(begin);
        while(!queue.isEmpty()){
            String tmp = queue.poll();
            if(tmp.equals(target)){
                return map.get(target);
            }
            for(int i = 0; i < words.length; i++){
                int tct = 0;
                for(int j = 0; j < words[i].length(); j++){
                    if(tmp.charAt(j) != words[i].charAt(j)){
                        tct += 1;
                    }
                }
                if(tct == 1 && !set.contains(words[i])){
                    set.add(words[i]);
                    map.put(words[i], map.get(tmp) + 1);
                    queue.add(words[i]);
                }
            }
        }
        
        return 0;
    }
}