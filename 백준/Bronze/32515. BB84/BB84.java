import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();
        String D = br.readLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            if(A.charAt(i) == C.charAt(i)){
                if(B.charAt(i) == D.charAt(i)){
                    sb.append(B.charAt(i));
                }
                else{
                    System.out.println("htg!");
                    System.exit(0);
                }
            }
        }
        System.out.println(sb.toString());


    }
}


