class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int []num = new int[number+1];
        for(int i = 1; i <= number; i++){
            for(int j = i; j <= number; j+=i){
                num[j] += 1;
            }
        }
        for(int i = 1; i <= number; i++){
            if(num[i] > limit){
                answer += power;
            }
            else{
                answer += num[i];
            }
        }
        return answer;
    }
}