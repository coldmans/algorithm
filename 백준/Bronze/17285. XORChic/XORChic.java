import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String T = br.readLine();
        String target = "CHICKENS";
        int key = T.charAt(0) ^ target.charAt(0);
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < T.length(); i++){
            char decrypted = (char) (T.charAt(i) ^ key);
            result.append(decrypted);
        }
        System.out.println(result.toString());
    }
}


