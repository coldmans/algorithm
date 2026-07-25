class Solution {
    public String solution(String s) {
        String answer = "";
        String []arr;
        arr = s.split(" ",-1);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length(); j++){
                if((j + 1) % 2 == 1){
                    char a = arr[i].charAt(j);
                    answer += Character.toUpperCase(a);
                }
                else{
                    char a = arr[i].charAt(j);
                    answer += Character.toLowerCase(a);
                }
            }
            if(i != arr.length - 1){
            answer = answer + " ";
            }
        }
        return answer;
    }
}