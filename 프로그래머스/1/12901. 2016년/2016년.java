class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int ans = 0;
    
        for(int tt = 1; tt < a; tt++){
            if(tt == 1 || tt == 3 || tt == 5 || tt == 7 || tt == 8 || tt == 10){
                ans += 31; 
            }
            else if(tt == 2){
                ans += 29;
            }
            else{
                ans += 30;
            }
        }
        
        ans += b;
        
        
        
        if(ans % 7 == 3){
            return "SUN";
        }
        else if(ans % 7 == 4){
            return "MON";
        }
        else if(ans % 7 == 5){
            return "TUE";
        }
        else if(ans % 7 == 6){
            return "WED";
        }
        else if(ans % 7 == 0){
            return "THU";
        }
        else if(ans % 7 == 1){
            return "FRI";
        } 
        else if(ans % 7 == 2){
            return "SAT";
        }
        return answer;
    }
}