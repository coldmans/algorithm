import java.io.*;
import java.util.*;

public class Main {


    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++){
            List<Integer> la = new ArrayList<>();
            List<Integer> lb = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < a; i++){
                la.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(la);

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < b; i++){
                lb.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(lb);

            int []dp = new int[a+1];

            for(int i = 0; i < b; i++){
                if(la.get(0) > lb.get(i)){
                    dp[0] += 1;
                }
                else{
                    break;
                }
            }

            for(int i = 1; i < a; i++){
                int ctt = 0;
                for(int j = dp[i-1]; j < b; j++){
                    if(la.get(i) <= lb.get(j)) break;
                    ctt += 1;
                }
                dp[i] = dp[i-1] + ctt;
            }

            System.out.println(Arrays.stream(dp).sum());


        }


    }
}


