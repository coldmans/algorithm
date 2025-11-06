import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long []arr = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Long.parseLong(st.nextToken());
            if(arr[i] == 4611686018427387904L){
                System.out.println(4611686018427387904L);
                System.exit(0);
            }
        }
        long maxi = -1;
        Set<Long> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                maxi = Math.max(maxi, arr[i]);
            }
            else{
                long t = arr[i];
                while(true){
                    set.remove(t);
                    if(set.contains(t * 2)){
                        t *= 2;
                    }
                    else {
                        set.add(t * 2);
                        maxi = Math.max(maxi, t*2);
                        break;
                    }
                }
            }

        }

        System.out.println(maxi);




    }
}
