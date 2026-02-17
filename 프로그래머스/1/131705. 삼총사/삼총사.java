class Solution {
    static int answer;
    static void recur(int i, int ctt, int tmp, int []number){
        if(ctt == 3 && tmp == 0){
            answer ++;
            return;
        }
        
        if(i == number.length){
            return;
        }
        recur(i + 1, ctt + 1, tmp + number[i], number);
        recur(i + 1, ctt, tmp, number);
    }
    public int solution(int[] number) {
        answer = 0;
        recur(0, 0, 0, number);
        return answer;
    }
}