class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(true){
            int ta = answer;
            int tmp = n / a;
            int tmpN = n - tmp * a;
            answer += tmp * b;
            n = tmpN + tmp * b;
            if(ta == answer) break;
        }
        return answer;
    }
}