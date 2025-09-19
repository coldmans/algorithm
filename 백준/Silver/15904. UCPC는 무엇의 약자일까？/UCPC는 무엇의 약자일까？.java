import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            if(res == 0 && s.charAt(i) == 'U'){
                res += 1;
            }
            else if(res == 1 && s.charAt(i) == 'C'){
                res += 1;
            }
            else if(res == 2 && s.charAt(i) == 'P'){
                res += 1;
            }
            else if(res == 3 && s.charAt(i) == 'C'){
                res += 1;
            }
        }
        if(res == 4){
            System.out.println("I love UCPC");
        }else{
            System.out.println("I hate UCPC");
        }



    }
}
