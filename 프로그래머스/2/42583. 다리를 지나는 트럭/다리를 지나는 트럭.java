import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int []q = new int[bridge_length];
        answer += 1;
        q[bridge_length - 1] = truck_weights[0];
        int index = 1;
        int sum = truck_weights[0];
        int ctt = 0;
        while(true){
            if(q[0] != 0){
                sum -= q[0];
                q[0] = 0;
                ctt += 1;
            }
            if(ctt == truck_weights.length){
                break;
            }
            for(int i = 1; i < bridge_length; i++){
                q[i-1] = q[i];
            }
            q[bridge_length-1] = 0;
            if(index < truck_weights.length && sum + truck_weights[index] <= weight){
                q[bridge_length - 1] = truck_weights[index];
                sum += truck_weights[index];
                index += 1;
            }
            answer += 1;

        }
        return answer + 1;
    }
}