import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []input = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = input[0].length()-1; i >= 0; i--){
            sb.append(input[0].charAt(i));
        }
        int A = Integer.parseInt(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        for(int i = input[1].length()-1; i >= 0; i--){
            sb2.append(input[1].charAt(i));
        }
        int B = Integer.parseInt(sb2.toString());
        String C = (A+B) + "";
        StringBuilder sb3 = new StringBuilder();
        for(int i = C.length()-1; i >= 0; i--){
            sb3.append(C.charAt(i));
        }
        System.out.println(Integer.parseInt(sb3.toString()));



    }
}


