import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int tmps = 0;
        for(int i = 0; i < N; i++){
            String tmp = br.readLine();
            boolean em = false;
            for(int j = 0; j < tmp.length() - 1; j++){
                if(tmp.charAt(j) == '0'){
                    if(tmp.charAt(j+1) == '1'){
                        em = true;
                    }
                }
                if(tmp.charAt(j) == 'O'){
                    if(tmp.charAt(j+1) == 'I'){
                        em = true;
                    }
                }
            }
            if(em){
                tmps += 1;
            }
        }
        System.out.println(tmps);

    }
}


