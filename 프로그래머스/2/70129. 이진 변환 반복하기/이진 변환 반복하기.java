class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int ctt = 0;
        int zero = 0;
        
        while(true){
            int tmp = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0'){
                    tmp += 1;
                }
            }
                            zero += tmp;
                ctt ++;
                s = Integer.toBinaryString(s.length() - tmp);
                if(s.equals("1")){
                    break;
                }
        }
        
        answer[0] = ctt;
        answer[1] = zero;
        
        return answer;
    }
}

