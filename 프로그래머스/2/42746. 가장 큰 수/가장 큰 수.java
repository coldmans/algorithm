import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            list.add(numbers[i] + "");
        }
        Collections.sort(list, (a,b) -> {
            int res = (a+b).compareTo(b+a);
            if(res > 0){
                return -1;
            }
            if(res < 0){
                return 1;
            }
            return 0;
        });
        
        if(list.get(0).charAt(0) == '0'){
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(String s : list){
            sb.append(s);
        }
        return sb.toString();
    }
}