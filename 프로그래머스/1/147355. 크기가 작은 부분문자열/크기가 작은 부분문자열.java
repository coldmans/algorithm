class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pp = Long.parseLong(p);
        
        int len = p.length();
        
        for(int i = 0; i <= t.length() - len; i++){
            String s = t.substring(i, i + len);
            long tmp = Long.parseLong(s);
            
            if(tmp <= pp){
                answer ++;
            }
        }
        
        return answer;
    }
}