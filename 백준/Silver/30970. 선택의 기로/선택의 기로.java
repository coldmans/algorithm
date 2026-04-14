import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        List<int []> list = new ArrayList<>();

        int T = Integer.parseInt(st.nextToken());
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new int[]{a, b});
        }

        Collections.sort(list, (a, b) -> {
            if(a[0] == b[0]){
                return a[1] - b[1];
            }
            return b[0] - a[0];
        });

        System.out.println(list.get(0)[0] + " " + list.get(0)[1] + " " + list.get(1)[0] + " " + list.get(1)[1]);

        Collections.sort(list, (a, b) -> {
            if(a[1] == b[1]){
                return b[0] - a[0];
            }
            return a[1] - b[1];
        });

        System.out.println(list.get(0)[0] + " " + list.get(0)[1] + " " + list.get(1)[0] + " " + list.get(1)[1]);




    }
}