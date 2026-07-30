class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                answer += ' ';
                continue;
            }
            int tmp = (int) s.charAt(i);
            
            if(tmp >= 97){
                tmp += n;
                if(tmp >= 123){
                    tmp -= 26;
                }
            }
            else{
                tmp += n;
                if(tmp >= 91){
                    tmp -= 26;
                }
            }
            answer += (char) tmp;
            
        }
        return answer;
    }
}