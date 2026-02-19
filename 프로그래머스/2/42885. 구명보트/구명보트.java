import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        int []visit = new int[people.length];
        int ctt = 0;
        while(i < j){
            if(people[i] + people[j] <= limit){
                visit[i] = 1;
                visit[j] = 1;
                ctt += 1;
                i+=1;
                j-=1;
            }
            else{
                j -= 1;
            }
        }
        
        for(int k = 0; k < people.length; k++){
            if(visit[k] != 1){
                ctt += 1;
            }
        }        
        return ctt;
    }
}