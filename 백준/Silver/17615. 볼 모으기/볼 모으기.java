import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Math.min;

public class Main {



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int ctt = Integer.MAX_VALUE;
        String color = br.readLine();
        boolean ok = false;
        int tmp = 0;
        for(int i = 0; i < color.length(); i++){
            if(!ok && color.charAt(i) == 'B'){
                ok = true;
                continue;
            }
            if(ok && color.charAt(i) == 'R'){
                tmp += 1;
            }
        }
        ctt = min(tmp,ctt);

        ok = false;
        tmp = 0;
        for(int i = 0; i < color.length(); i++){
            if(!ok && color.charAt(i) == 'R'){
                ok = true;
                continue;
            }
            if(ok && color.charAt(i) == 'B'){
                tmp += 1;
            }
        }
        ctt = min(tmp,ctt);

        ok = false;
        tmp = 0;
        for(int i = color.length()-1; i >= 0; i--){
            if(!ok && color.charAt(i) == 'R'){
                ok = true;
                continue;
            }
            if(ok && color.charAt(i) == 'B'){
                tmp += 1;
            }
        }
        ctt = min(tmp,ctt);

        ok = false;
        tmp = 0;
        for(int i = color.length()-1; i >= 0; i--){
            if(!ok && color.charAt(i) == 'B'){
                ok = true;
                continue;
            }
            if(ok && color.charAt(i) == 'R'){
                tmp += 1;
            }
        }
        ctt = min(tmp,ctt);

        System.out.println(ctt);








    }
}


