import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int []arr = new int[elements.length * 2];
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < elements.length; i++){
            arr[i] = elements[i];
            arr[elements.length + i] = elements[i];
        }
        
        for(int i = 1; i < elements.length; i++){
            for(int j = 0; j < arr.length - i + 1; j++){
                int tmp = 0;
                for(int k = j; k < j + i; k++){
                    tmp += arr[k];
                }
                set.add(tmp);
            }
        }
        
        return set.size() + 1;
    }
}