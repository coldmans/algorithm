class Solution {
    public boolean solution(int x) {

        String y = x + "";
        int tmp = 0;
        for(int i = 0; i < y.length(); i++){
            tmp += (int) y.charAt(i) - '0';
        }
        if(x % tmp == 0){
            return true;
        }
        else{
            return false;
        }
        
    }
}