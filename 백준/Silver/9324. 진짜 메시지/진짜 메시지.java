import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            int []m = new int[123];
            String s = br.readLine();
            boolean fake = false;
            for(int j = 0; j < s.length(); j++){
                int k = s.charAt(j);
                m[k] += 1;
                if((m[k] == 3) || (m[k] > 3 && (m[k] - 3) % 4 == 0)){
                    if(j+1 == s.length() || s.charAt(j) != s.charAt(j+1)){
                        fake = true;
                        System.out.println("FAKE");
                        break;
                    }
                }
            }
            if(!fake) System.out.println("OK");
        }


    }
}


