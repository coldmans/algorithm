import java.util.*;

class Solution {
    static int[] one = {1,2,3,4,5};
    static int[] two = {2,1,2,3,2,4,2,5};
    static int[] three = {3,3,1,1,2,2,4,4,5,5};
    
    public int[] solution(int[] answers) {

        int[] good = new int[3];
        
        int onep = 0;
        int twop = 0;
        int threep = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == one[onep]){
                good[0] += 1;
            }
                onep += 1;
                if(onep == one.length){
                    onep = 0;
                }
            if(answers[i] == two[twop]){
                good[1] += 1;
            }
                            twop += 1;
                if(twop == two.length){
                    twop = 0;
                }
            if(answers[i] == three[threep]){
                good[2] += 1;
            }
                            threep += 1;
                if(threep == three.length){
                    threep = 0;
                }
        }
        int max = 0;
        for(int i = 0; i < good.length; i++){
            max = Math.max(good[i], max);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < good.length; i++){
            if(good[i] == max){
                list.add(i+1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}