import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            return new int[]{-1};
        }
        int[] answer = new int[arr.length-1];
        int tmp = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            tmp = Math.min(tmp, arr[i]);
        }
        int i = 0;
        int j = 0;
        
        while(j < arr.length){
            if(arr[j] == tmp){
                j += 1;
            }
            else{
                answer[i] = arr[j];
                i += 1;
                j += 1;
            }
        }
        return answer;
    }
}