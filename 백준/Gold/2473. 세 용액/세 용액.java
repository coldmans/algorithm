import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < x; i++){
            int y = Integer.parseInt(st.nextToken());
            list.add(y);
        }
        Collections.sort(list);


        long res = Long.MAX_VALUE;
        int rx = -1;
        int ry = -1;
        int rz = -1;

        for(int i = 0; i < x - 2; i++){
            for(int j = 2; j < x; j++){
            long tmp = list.get(i) + list.get(j);
            int ti = i;
            int tj = j;

            while(ti < tj) {
                int mid = (ti + tj)/2;
                if(mid == ti || mid == tj){
                    break;
                }
                if (tmp + list.get(mid) <= 0) {
                    res = Math.min(res, (tmp + list.get(mid)) * -1);
                    if (res == (tmp + list.get(mid)) * -1) {
                        rx = list.get(i);
                        ry = list.get(j);
                        rz = list.get(mid);
                    }
                    ti = mid;
                } else if (tmp + list.get(mid) > 0) {
                    res = Math.min(res, tmp + list.get(mid));
                    if (res == (tmp + list.get(mid))) {
                        rx = list.get(i);
                        ry = list.get(j);
                        rz = list.get(mid);
                    }
                    tj = mid - 1;
                }
            }}


        }

        System.out.println(rx + " " + rz + " " + ry);




    }
}
