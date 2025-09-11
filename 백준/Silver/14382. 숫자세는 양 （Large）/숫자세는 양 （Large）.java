import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++){
            int x = 2;
            Set<Character> set = new HashSet<>();
            String tmp = br.readLine();
            String wax = tmp;
            while(true){
                for(int j = 0; j < tmp.length(); j++){
                    set.add(tmp.charAt(j));
                }
                if(set.size() == 10){
                    System.out.println("Case #" + i + ": " + tmp);
                    break;
                }
                tmp = String.valueOf(Integer.parseInt(wax) * x);

                x += 1;
                if(x >= 120){
                    System.out.println("Case #" + i + ": INSOMNIA");
                    break;
                }
            }

        }


    }
}
