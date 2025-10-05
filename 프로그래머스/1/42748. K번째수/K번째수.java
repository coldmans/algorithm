import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int x = commands[i][0]-1;
            int y = commands[i][1]-1;
            int z = commands[i][2]-1;
            int []arr = new int[y-x+1];
            for(int j = x; j <= y; j++){
                arr[j-x] = array[j];
            }
            Arrays.sort(arr);
            answer[i] = arr[z];
            
        }
        
        return answer;
    }
}