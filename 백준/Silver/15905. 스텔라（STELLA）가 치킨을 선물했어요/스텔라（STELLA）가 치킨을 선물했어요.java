import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int D = Integer.parseInt(br.readLine());
        List<int []> list = new ArrayList<>();
        for(int i = 0; i < D; i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int sc = Integer.parseInt(st.nextToken());
            list.add(new int[]{p,sc});
        }

        list.sort(Comparator.comparingInt((int [] a) -> a[0]).reversed().thenComparingInt(a -> a[1]));
        int t = list.get(4)[0];
        int res = 0;
        for(int i = 5; i < list.size(); i++){
            if(t == list.get(i)[0]){
                res += 1;
            }
            else{
                break;
            }
        }
        System.out.println(res);




    }
}
