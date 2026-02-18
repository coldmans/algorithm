class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = 0;
        int i = n + 1;
        String s = Integer.toBinaryString(n);

        for(int j = 0; j < s.length(); j++){
            if(s.charAt(j) == '1'){
                tmp++;
            }
        }
        
        while(true){
            String tmpS = Integer.toBinaryString(i);
            int ttmp = 0;
            for(int j = 0; j < tmpS.length(); j++){
                if(tmpS.charAt(j) == '1'){
                    ttmp++;
                }
                if(ttmp > tmp){
                    break;
                }
            }
            if(i == 23){
                System.out.println(tmp);
                System.out.println(ttmp);
                System.out.println(tmpS);
            }
            if(ttmp == tmp){
                answer = i;
                break;
            }
            i++;
        }
        
        
        return answer;
    }
}