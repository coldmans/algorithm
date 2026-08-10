class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        if(n == m){
            return 1;
        }
        if(m == 1){
            return section.length;
        }
        int i = 0;
        int start = 0;
        
        while(true){
            if(m >= n || i == section.length){
                break;
            }
            while(section[i] < start){
                i++;
                if(i == section.length){
                    break;
                }
            }
            if(i == section.length){
                break;
            }
            start = section[i];
            start += m;
            answer++;
        }
        return answer;
    }
}