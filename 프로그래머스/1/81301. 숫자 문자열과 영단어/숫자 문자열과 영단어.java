import java.util.*;
class Solution {
    public int solution(String s) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                answer += s.charAt(i);
            }
            else{
                if(s.charAt(i) == 'z'){
                    i += 3;
                    answer += '0';
                }
                else if(s.charAt(i) == 'o'){
                    i += 2;
                    answer += '1';
                }
                else if(s.charAt(i) == 't'){
                    if(s.charAt(i+1) == 'w'){
                        i += 2;
                        answer += '2';
                    }
                    else{
                        i += 4;
                        answer += '3';
                    }
                }
                else if(s.charAt(i) == 'f'){
                    if(s.charAt(i+1) == 'o'){
                        i += 3;
                        answer += '4';
                    }
                    else{
                        i += 3;
                        answer += '5';
                    }
                }
                else if(s.charAt(i) == 's'){
                    if(s.charAt(i+1) == 'i'){
                        i += 2;
                        answer += '6';
                    }
                    else{
                        i += 4;
                        answer += '7';
                    }
                }
                else if(s.charAt(i) == 'e'){
                    i += 4;
                    answer += '8';
                }
                else if(s.charAt(i) == 'n'){
                    i += 3;
                    answer += '9';
                    
                }
            }
        }
        
        return Integer.parseInt(answer);
    }
}