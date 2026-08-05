class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int i = 0;
        int j = 0;
        int k = 0;
        boolean isTrue = true;
        while(k < goal.length){
            if(i < cards1.length && cards1[i].equals(goal[k])){
                i += 1;
                k += 1;
            }
            else if(j < cards2.length && cards2[j].equals(goal[k])){
                j += 1;
                k += 1;
            }
            else{
                isTrue = false;
                break;
            }
        }
        if(isTrue){
            return "Yes";
        }
        return "No";
        
    }
}