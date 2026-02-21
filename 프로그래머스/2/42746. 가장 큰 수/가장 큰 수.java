import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        List<String> list = new ArrayList<>();
        
        for(int num : numbers){
            list.add(String.valueOf(num));
        }
        
        Collections.sort(list, (a, b) -> (b + a).compareTo(a + b));
        
        if(list.get(0).equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for(String s : list){
            sb.append(s);
        }
        
        return sb.toString();
    }
}