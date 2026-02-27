import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
        int []who = new int[3];
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == supo1[a]){
                who[0] += 1;
            }
            if(answers[i] == supo2[b]){
                who[1] += 1;
            }
            if(answers[i] == supo3[c]){
                who[2] += 1;
            }
            a += 1;
            b += 1;
            c += 1;
            
            if(a == supo1.length){
                a = 0;
            }
            if(b == supo2.length){
                b = 0;
            }
            if(c == supo3.length){
                c = 0;
            }
        }
        int max = 0;
        for(int i = 0; i < 3; i++){
            max = Math.max(max, who[i]);
        }
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < 3; i++){
            if(who[i] == max){
                list.add(i+1);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}