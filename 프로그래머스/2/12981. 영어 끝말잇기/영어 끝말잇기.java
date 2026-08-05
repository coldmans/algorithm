import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int tmp = 0;
        Set<String> set = new HashSet<>();
        boolean isNo = false;
        
        set.add(words[0]);
        
        for(int i = 1; i < words.length; i++){
            if(words[i-1].charAt(words[i-1].length()-1) == words[i].charAt(0)){
                if(set.contains(words[i])){
                    tmp = i;
                    isNo = true;
                    break;
                }
                else{
                    set.add(words[i]);
                }
            }
            else if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                    tmp = i;
                    isNo = true;
                    break;
            }
        }
        
        if(!isNo){
            return answer;
        }
        
        tmp += 1;
        answer[0] = tmp % n;
        if(answer[0] == 0){
            answer[0] = n;
        }
        
        answer[1] = tmp / n;
        if(tmp % n != 0){
            answer[1] += 1;
        }
        
        

        return answer;
    }
}