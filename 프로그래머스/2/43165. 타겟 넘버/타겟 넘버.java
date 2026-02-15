class Solution {
    static int answer;
    
    static void recur(int[]numbers, int i, int tmp, int target){
        if(i == numbers.length){
            if(tmp == target){
                answer++;
            }
            return;
        }
        
        recur(numbers, i+1, tmp - numbers[i], target);
        recur(numbers, i+1, tmp + numbers[i], target);
    }
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        recur(numbers, 0, 0, target);
        return answer;
    }
}