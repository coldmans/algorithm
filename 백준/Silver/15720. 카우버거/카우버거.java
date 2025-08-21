import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []input = br.readLine().split(" ");
        int B = Integer.parseInt(input[0]);
        int C = Integer.parseInt(input[1]);
        int D = Integer.parseInt(input[2]);
        int total = 0;

        String []bur = br.readLine().split(" ");
        Integer []burger = new Integer[B];
        for(int i = 0; i < B; i++){
            burger[i] = Integer.parseInt(bur[i]);
            total += burger[i];
        }
        Arrays.sort(burger,Collections.reverseOrder());
        String []si = br.readLine().split(" ");
        Integer []side = new Integer[C];
        for(int i = 0; i < C; i++){
            side[i] = Integer.parseInt(si[i]);
            total += side[i];
        }
        Arrays.sort(side, Collections.reverseOrder());
        String []w = br.readLine().split(" ");
        Integer []wa = new Integer[D];
        for(int i = 0; i < D; i++){
            wa[i] = Integer.parseInt(w[i]);
            total += wa[i];
        }
        Arrays.sort(wa,Collections.reverseOrder());

        System.out.println(total);

        int i = 0;
        int to = 0;
        while(i < B && i < C && i < D){
            to += burger[i] + side[i] + wa[i];
            i += 1;
        }
        int res = total - to;

        
        System.out.println((int)(to * 0.9) + res);



    }
}


