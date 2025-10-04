import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int []arr = new int[progresses.length];
        for(int i = 0; i < progresses.length; i++){
            arr[i] = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0){
                arr[i] += 1;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= 0) continue;
            int tmp = arr[i];
            for(int j = i; j < arr.length; j++){
                arr[j] -= tmp;
            }
            int res = 0;
            for(int j = i; j < arr.length; j++){
                if(arr[j] > 0) break;
                res += 1;
            }
            list.add(res);
        }
        
        
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}