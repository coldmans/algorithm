import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        for(int i = 0; i < T; i++){
            long t = 0L;
            List<Integer> list = new ArrayList<>();
            while(true){
                int j = Integer.parseInt(br.readLine());
                if(j == 0) break;
                list.add(j);
            }
            list.sort(Collections.reverseOrder());
            for(int k = 0; k < list.size(); k++){
                t += 2 * Math.pow(list.get(k), k+1);
            }
            if(t > 5 * Math.pow(10,6)){
                System.out.println("Too expensive");
            }
            else{
                System.out.println(t);
            }



        }





    }
}