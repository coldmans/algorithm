import java.util.*;
class Solution {
    public long solution(long n) {
    
        List<Integer> list = new ArrayList<>();
        String s = n + "";
        for(int i = 0; i < s.length(); i++){
            list.add((int)s.charAt(i) - '0');
        }
        Collections.sort(list, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int num : list){
            sb.append(num);
        }
        
        return Long.parseLong(sb.toString());
    }
}