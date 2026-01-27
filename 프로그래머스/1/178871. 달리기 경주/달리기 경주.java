import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            hashMap.put(players[i], i);
        }
        for(int i = 0; i < callings.length; i++){
            boolean isOk = false;
            int tmp = hashMap.get(callings[i]);
            
            String tt = players[tmp];
            players[tmp] = players[tmp - 1];
            players[tmp - 1] = tt;
            
            
            hashMap.put(tt, tmp - 1);           
            hashMap.put(players[tmp], tmp);
        }
        return players;
    }
}