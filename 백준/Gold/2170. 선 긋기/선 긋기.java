import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < t; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new int[]{a,b});
        }

        Collections.sort(list, (a,b) ->{
            if(a[0] == b[0]){
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        int idx = 1;
        int realStart = list.get(0)[0];
        int res = 0;
        int start = list.get(0)[1];

        while(idx < t){
            if(start < list.get(idx)[0]){
                res -= (list.get(idx)[0] - start);
            }
            start = Math.max(list.get(idx)[1], start);
            idx ++;

        }
        System.out.println(res + start - realStart);




    }
}
