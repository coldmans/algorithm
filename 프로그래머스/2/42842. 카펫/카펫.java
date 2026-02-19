class Solution {
    public int[] solution(int yellow, int brown) {
        int[] answer = new int[2];
        for(int i = 1; i <= brown; i++){
            if(brown % i == 0){
                int tmp = brown / i;
                if((i * 2 + tmp * 2 + 4) == yellow){
                    answer[0] = tmp + 2;
                    answer[1] = i + 2;
                    return answer;
                }
            }
        }
        return answer;
    }
}