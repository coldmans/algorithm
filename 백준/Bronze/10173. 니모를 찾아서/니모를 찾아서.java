import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            boolean find = false;
            String [] s = br.readLine().split(" ");
            for(int i = 0; i < s.length; i++){
                
                if(s[i].equals("EOI")){
                    System.exit(0);
                }
                s[i] = s[i].toUpperCase();
                if(s[i].equals("NEMO")){
                    find = true;
                    break;
                }
                if(s[i].equals("NEMO,")){
                    find = true;
                    break;
                }
                if(s[i].equals("NEMO.")){
                    find = true;
                    break;
                }

            }
            if(find){
                System.out.println("Found");
            }
            else{
                System.out.println("Missing");
            }


        }


    }
}
