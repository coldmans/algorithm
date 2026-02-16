class Solution {
    public int solution(int num) {
        int tempt = 0;
        while(tempt <= 500){
            if(num == 1){
                return tempt;
            }
            if(num % 2 == 0){
                num /= 2;
            }
            else if(num % 2 == 1){
                num = num * 3 + 1;
            }
            tempt += 1;
        }
        return -1;
    }
}